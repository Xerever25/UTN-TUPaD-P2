package trabajopractico3ejercicio11;

import java.io.PrintStream;

class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre='" + nombre + '\'' + ", genero='" + genero + '\'' + '}';
    }
}

class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo='" + titulo + '\'' + ", artista=" + artista + '}';
    }
}

class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("▶ Reproduciendo: " + cancion);
    }
}

public class TrabajoPractico3ejercicio11 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Artista artista = new Artista("Shakira", "Pop");
        Cancion cancion = new Cancion("Hips Don't Lie", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}
