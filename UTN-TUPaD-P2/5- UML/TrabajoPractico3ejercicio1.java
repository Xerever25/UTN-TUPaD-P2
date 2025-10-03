package trabajopractico3ejercicio1;

class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen='" + imagen + '\'' + ", formato='" + formato + '\'' + '}';
    }
}

class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + '}';
    }
}

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;       // Composición
    private Titular titular; // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this); // vínculo bidireccional
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero='" + numero + '\'' + ", fechaEmision='" + fechaEmision + '\'' +
                ", foto=" + foto + ", titular=" + titular + '}';
    }
}

public class TrabajoPractico3ejercicio1 {
    public static void main(String[] args) {
        Foto foto = new Foto("perfil.jpg", "jpg");
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("A00112233", "2025-01-01", foto, titular);

        System.out.println(pasaporte);
    }
}
