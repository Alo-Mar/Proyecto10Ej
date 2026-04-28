/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitacora;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    public void guardar(String fecha, String actividad) {
        try {
            FileWriter fw = new FileWriter("bitacora.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(fecha + "," + actividad);

            pw.close();
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}