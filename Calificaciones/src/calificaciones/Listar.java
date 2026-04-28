/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calificaciones;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Listar {

    private final String archivo = "bitacora.txt";

    public ArrayList<String[]> listar() {
        ArrayList<String[]> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(datos);
            }

            // Ordenar por nombre
            Collections.sort(lista, (a, b) -> a[0].compareToIgnoreCase(b[0]));

        } catch (Exception e) {
            System.out.println("Error al leer");
        }

        return lista;

    }
}
