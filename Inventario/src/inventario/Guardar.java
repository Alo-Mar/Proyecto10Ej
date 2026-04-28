/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Guardar {

    public void guardar(String id, String nombre, String precio, String cant) {
        try {
            FileWriter fw = new FileWriter("productos.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(id + "," + nombre + "," + precio + "," + cant);

            pw.close();
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}