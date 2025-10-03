package trabajopractico3ejercicio13;

import java.io.PrintStream;

class UsuarioQR {
    private String nombre;
    private String email;

    public UsuarioQR(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioQR{" + "nombre='" + nombre + '\'' + ", email='" + email + '\'' + '}';
    }
}

class CodigoQR {
    private String valor;
    private UsuarioQR usuario; // Asociación unidireccional

    public CodigoQR(String valor, UsuarioQR usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor='" + valor + '\'' + ", usuario=" + usuario + '}';
    }
}

class GeneradorQR {
    public void generar(String valor, UsuarioQR usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // Dependencia de creación
        System.out.println("📱 QR generado: " + qr);
    }
}

public class TrabajoPractico3ejercicio13 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        UsuarioQR usuario = new UsuarioQR("María López", "maria@mail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("https://miweb.com", usuario);
    }
}
