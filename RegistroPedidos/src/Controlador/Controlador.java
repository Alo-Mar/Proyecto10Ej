/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Guardar.Guardar;
import Listar.Listar;
import java.util.ArrayList;

public class Controlador {

    Guardar g = new Guardar();
    Listar l = new Listar();

    public void guardar(String cliente, String producto, String cantidad) {
        g.guardar(cliente, producto, cantidad);
    }

    public ArrayList<String> listar() {
        return l.leer();
    }
}