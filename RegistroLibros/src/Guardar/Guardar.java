/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guardar;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    public void guardar(String isbn, String titulo, String autor) {
        try {
            FileWriter fw = new FileWriter("libros.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(isbn + "," + titulo + "," + autor);

            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}