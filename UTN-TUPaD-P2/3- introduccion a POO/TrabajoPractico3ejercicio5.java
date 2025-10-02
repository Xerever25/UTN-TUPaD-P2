package trabajopractico3ejercicio5;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

class NaveEspacial {
    private String nombre;
    private int combustible;
    private int capacidadMaxima = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible >= 0 && combustible <= capacidadMaxima) {
            this.combustible = combustible;
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= capacidadMaxima) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        } else {
            System.out.println("No se puede recargar más allá de la capacidad máxima.");
        }
    }
}

public class TrabajoPractico3ejercicio5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        NaveEspacial nave1 = new NaveEspacial("Andrómeda", 50);

        System.out.println("Estado inicial: " + nave1.getNombre() + " con " + nave1.getCombustible() + " unidades de combustible");

        nave1.avanzar(10);
        nave1.despegar();
        nave1.recargarCombustible(30);
        nave1.avanzar(20);

        System.out.println("Estado final: " + nave1.getNombre() + " con " + nave1.getCombustible() + " unidades de combustible");
    }
}
