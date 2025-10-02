package trabajopractico3ejercicio3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año inválido. No se aplicaron cambios.");
        }
    }
}

public class TrabajoPractico3ejercicio3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion());

        libro1.setAnioPublicacion(-200); 
        libro1.setAnioPublicacion(2015);

        System.out.println("Datos finales del libro:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion());
    }
}
