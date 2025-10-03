
package trabajopractico3ejercicio3;
class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre='" + nombre + '\'' + ", nacionalidad='" + nacionalidad + '\'' + '}';
    }
}

class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre='" + nombre + '\'' + ", direccion='" + direccion + '\'' + '}';
    }
}

class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;       // Asociación unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", isbn='" + isbn + '\'' +
                ", autor=" + autor + ", editorial=" + editorial + '}';
    }
}

public class TrabajoPractico3ejercicio3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Cien años de soledad", "978-84-376-0494-7", autor, editorial);

        System.out.println(libro);
    }
}

