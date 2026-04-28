/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import java.util.ArrayList;
import java.util.Comparator;

public class Estudiantes {

    // Clase interna (NO necesitas otro archivo)
    public static class Estudiante {
        private String control;
        private String nombre;
        private String carrera;
        private double promedio;

        public Estudiante(String control, String nombre, String carrera, double promedio) {
            this.control = control;
            this.nombre = nombre;
            this.carrera = carrera;
            this.promedio = promedio;
        }

        public String getControl() { return control; }
        public String getNombre() { return nombre; }
        public String getCarrera() { return carrera; }
        public double getPromedio() { return promedio; }
    }

    // Lista donde se guardan los datos
    private ArrayList<Estudiante> lista = new ArrayList<>();

    // Método para guardar
    public void agregar(String control, String nombre, String carrera, double promedio) {
        lista.add(new Estudiante(control, nombre, carrera, promedio));
    }

    // Método para obtener lista ordenada por nombre
    public ArrayList<Estudiante> getListaOrdenada() {
        lista.sort(Comparator.comparing(Estudiante::getNombre));
        return lista;
    }
}