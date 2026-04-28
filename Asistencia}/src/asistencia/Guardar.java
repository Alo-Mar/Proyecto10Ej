/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asistencia;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    public void guardar(String nombre, String fecha, String estado) {
        try {
            FileWriter fw = new FileWriter("asistencia.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(nombre + "," + fecha + "," + estado);

            pw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}