package trabajopractico3ejercicio2;

class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo='" + modelo + '\'' + ", capacidad=" + capacidad + '}';
    }
}

class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + '}';
    }
}

class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación
    private Usuario usuario; // Asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this);
    }

    @Override
    public String toString() {
        return "Celular{" + "imei='" + imei + '\'' + ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
}

public class TrabajoPractico3ejercicio2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BT-5000", 4500);
        Usuario usuario = new Usuario("Ana López", "87654321");
        Celular celular = new Celular("1234567890", "Samsung", "S22", bateria, usuario);

        System.out.println(celular);
    }
}
