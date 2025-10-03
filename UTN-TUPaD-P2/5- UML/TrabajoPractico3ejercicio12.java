package trabajopractico3ejercicio12;

import java.io.PrintStream;

class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre='" + nombre + '\'' + ", cuil='" + cuil + '\'' + '}';
    }
}

class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
}

class Calculadora {
    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto() * 1.21; // Ejemplo con IVA 21%
        System.out.println("💰 Calculando impuesto: " + impuesto + " → Total con IVA=" + total);
    }
}

public class TrabajoPractico3ejercicio12 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Contribuyente c = new Contribuyente("Martín Pérez", "20-12345678-9");
        Impuesto i = new Impuesto(1000, c);
        Calculadora calc = new Calculadora();

        calc.calcular(i);
    }
}
