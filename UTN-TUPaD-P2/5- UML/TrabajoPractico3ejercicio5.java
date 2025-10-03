
package trabajopractico3ejercicio5;

import java.io.PrintStream;

class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + '}';
    }
}

class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo='" + modelo + '\'' + ", chipset='" + chipset + '\'' + '}';
    }
}

class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa; // Composición
    private Propietario propietario; // Asociación bidireccional

    public Computadora(String marca, String numeroSerie, PlacaMadre placa, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = placa;
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca='" + marca + '\'' + ", numeroSerie='" + numeroSerie + '\'' +
                ", placa=" + placa + ", propietario=" + propietario + '}';
    }
}

public class TrabajoPractico3ejercicio5 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Propietario propietario = new Propietario("Carlos Díaz", "22334455");
        PlacaMadre placa = new PlacaMadre("B550M", "AMD");
        Computadora pc = new Computadora("Asus", "SN12345", placa, propietario);

        System.out.println(pc);
    }
}
