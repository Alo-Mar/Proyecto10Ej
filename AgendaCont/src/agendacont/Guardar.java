/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacont;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    public void guardar(String nombre, String tel, String email) {
        try {
            FileWriter fw = new FileWriter("contactos.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(nombre + "," + tel + "," + email);

            pw.close();
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}