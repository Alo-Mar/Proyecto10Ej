/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrousuarios;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    private final String archivo = "usuarios.txt";

    public void guardar(String usuario, String password) {
        try (FileWriter fw = new FileWriter(archivo, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(usuario + "," + password);

        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}