/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package calificaciones;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    private final String archivo = "bitacora.txt";

    public void guardar(String nombre, String materia, String calificacion) {
        try (FileWriter fw = new FileWriter(archivo, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(nombre + "," + materia + "," + calificacion);

        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}