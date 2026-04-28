/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.util.ArrayList;

public class Controlador {

    private Guardar guardar = new Guardar();
    private Listar listar = new Listar();

    public void agregar(String id, String nombre, String precio, String cant) {
        guardar.guardar(id, nombre, precio, cant);
    }

    public ArrayList<String[]> listar() {
        return listar.obtenerLista();
    }
}