/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guardar;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    public void guardar(String cliente, String producto, String cantidad) {
        try {
            FileWriter fw = new FileWriter("pedidos.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(cliente + "," + producto + "," + cantidad);

            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}
