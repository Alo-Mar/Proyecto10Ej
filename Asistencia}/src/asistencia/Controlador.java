/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package asistencia;

import java.util.ArrayList;

public class Controlador {

    private Guardar guardar = new Guardar();
    private Listar listar = new Listar();

    // Guardar datos
    public void guardar(String nombre, String fecha, String estado) {
        guardar.guardar(nombre, fecha, estado);
    }

    // Obtener lista
    public ArrayList<String> listar() {
        return listar.leer();
    }
}