package trabajopractico3ejercicio;

import java.io.PrintStream;

class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + '}';
    }
}

class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre='" + nombre + '\'' + ", cuit='" + cuit + '\'' + '}';
    }
}

class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco;     // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero='" + numero + '\'' + ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", cliente=" + cliente + ", banco=" + banco + '}';
    }
}

public class TrabajoPractico3ejercicio {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Cliente cliente = new Cliente("Lucía Gómez", "33445566");
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567-8901-2345-6789", "12/27", cliente, banco);

        System.out.println(tarjeta);
    }
}
