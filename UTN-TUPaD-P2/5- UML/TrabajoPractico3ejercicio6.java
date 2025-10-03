package trabajopractico3ejercicio6;

import java.io.PrintStream;

class ClienteReserva {
    private String nombre;
    private String telefono;

    public ClienteReserva(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteReserva{" + "nombre='" + nombre + '\'' + ", telefono='" + telefono + '\'' + '}';
    }
}

class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
}

class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente; // Asociación unidireccional
    private Mesa mesa;              // Agregación

    public Reserva(String fecha, String hora, ClienteReserva cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha='" + fecha + '\'' + ", hora='" + hora + '\'' +
                ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }
}

public class TrabajoPractico3ejercicio6 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        ClienteReserva cliente = new ClienteReserva("María Torres", "341-5551234");
        Mesa mesa = new Mesa(12, 4);
        Reserva reserva = new Reserva("2025-10-05", "20:00", cliente, mesa);

        System.out.println(reserva);
    }
}
