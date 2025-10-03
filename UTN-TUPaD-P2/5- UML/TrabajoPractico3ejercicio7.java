
package trabajopractico3ejercicio7;

import java.io.PrintStream;

class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo='" + tipo + '\'' + ", numeroSerie='" + numeroSerie + '\'' + '}';
    }
}

class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre='" + nombre + '\'' + ", licencia='" + licencia + '\'' + '}';
    }
}

class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;     // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente='" + patente + '\'' + ", modelo='" + modelo + '\'' +
                ", motor=" + motor + ", conductor=" + conductor + '}';
    }
}

public class TrabajoPractico3ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Motor motor = new Motor("Nafta", "MTR-9988");
        Conductor conductor = new Conductor("Pedro Sánchez", "L12345");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla", motor, conductor);

        System.out.println(vehiculo);
    }
}
