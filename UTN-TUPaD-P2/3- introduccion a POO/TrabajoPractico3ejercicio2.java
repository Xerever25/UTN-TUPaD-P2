package trabajopractico3ejercicio2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
}

public class TrabajoPractico3ejercicio2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);

        System.out.println("Nombre: " + mascota1.getNombre());
        System.out.println("Especie: " + mascota1.getEspecie());
        System.out.println("Edad: " + mascota1.getEdad() + " años");

        mascota1.setEdad(mascota1.getEdad() + 1);

        System.out.println(mascota1.getNombre() + " ha cumplido un año.");
        System.out.println("Nueva edad: " + mascota1.getEdad() + " años");
    }
}
