package trabajopractico3ejercicio1;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificación ha aumentado en " + puntos + " puntos.");
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
        System.out.println("La calificación ha disminuido en " + puntos + " puntos.");
    }
}

public class Trabajopractico3ejercicio1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);

        System.out.println("Información inicial del estudiante:");
        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInfo();

        estudiante1.bajarCalificacion(2.0);
        estudiante1.mostrarInfo();
    }
}

