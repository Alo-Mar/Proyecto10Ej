/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitacora;

import java.io.*;
import java.util.*;

public class Listar {

    public ArrayList<String[]> obtenerLista() {
        ArrayList<String[]> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("bitacora.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(datos);
            }

            br.close();

            // Ordenar por fecha
            lista.sort(Comparator.comparing(a -> a[0]));

        } catch (Exception e) {
            System.out.println("Error al leer");
        }

        return lista;
    }
}