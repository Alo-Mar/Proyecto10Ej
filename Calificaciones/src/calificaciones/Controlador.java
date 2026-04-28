/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calificaciones;

import java.util.ArrayList;

public class Controlador {

    private Guardar guardar = new Guardar();
    private Listar listar = new Listar();

    public void guardarDato(String nombre, String materia, String calificacion) {
        guardar.guardar(nombre, materia, calificacion);
    }

    public ArrayList<String[]> obtenerDatos() {
        return listar.listar();
    }
}