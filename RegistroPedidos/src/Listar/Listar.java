/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Listar {

    public ArrayList<String> leer() {
        ArrayList<String> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("pedidos.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error al leer");
        }

        return lista;
    }
}