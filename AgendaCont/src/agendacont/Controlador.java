/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacont;

import java.util.ArrayList;

public class Controlador {

    private Guardar guardar = new Guardar();
    private Listar listar = new Listar();

    public void agregar(String nombre, String tel, String email) {
        guardar.guardar(nombre, tel, email);
    }

    public ArrayList<String[]> listar() {
        return listar.obtenerLista();
    }
}
