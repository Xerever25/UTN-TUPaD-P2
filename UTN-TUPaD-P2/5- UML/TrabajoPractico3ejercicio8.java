package trabajopractico3ejercicio8;

import java.io.PrintStream;

class UsuarioDoc {
    private String nombre;
    private String email;

    public UsuarioDoc(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioDoc{" + "nombre='" + nombre + '\'' + ", email='" + email + '\'' + '}';
    }
}

class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioDoc usuario; // Agregación

    public FirmaDigital(String codigoHash, String fecha, UsuarioDoc usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash='" + codigoHash + '\'' +
                ", fecha='" + fecha + '\'' + ", usuario=" + usuario + '}';
    }
}

class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo='" + titulo + '\'' + ", contenido='" + contenido + '\'' +
                ", firma=" + firma + '}';
    }
}

public class TrabajoPractico3ejercicio8 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        UsuarioDoc usuario = new UsuarioDoc("Laura Méndez", "laura@mail.com");
        FirmaDigital firma = new FirmaDigital("abc123hash", "2025-10-03", usuario);
        Documento documento = new Documento("Contrato", "Contenido del contrato...", firma);

        System.out.println(documento);
    }
}
