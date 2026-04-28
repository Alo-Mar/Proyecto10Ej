/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrousuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Listar {

    private final String archivo = "usuarios.txt";

    public ArrayList<String[]> listar() {
        ArrayList<String[]> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(datos);
            }

        } catch (Exception e) {
            System.out.println("Error al leer");
        }

        return lista;
    }
}
