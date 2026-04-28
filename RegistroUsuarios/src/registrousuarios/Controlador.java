/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrousuarios;

import java.util.ArrayList;

public class Controlador {

    private Guardar guardar = new Guardar();
    private Listar listar = new Listar();

    public void registrar(String usuario, String password) {
        guardar.guardar(usuario, password);
    }

    public boolean validar(String usuario, String password) {
        ArrayList<String[]> lista = listar.listar();

        for (String[] datos : lista) {
            if (datos[0].equals(usuario) && datos[1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}