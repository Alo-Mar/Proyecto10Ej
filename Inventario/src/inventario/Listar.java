/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.io.*;
import java.util.*;

public class Listar {

    public ArrayList<String[]> obtenerLista() {
        ArrayList<String[]> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("productos.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(datos);
            }

            br.close();

            // Ordenar por nombre (columna 1)
            lista.sort(Comparator.comparing(a -> a[1]));

        } catch (Exception e) {
            System.out.println("Error al leer");
        }

        return lista;
    }
}