package trabajopractico3ejercicio4;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        }
    }
}

public class TrabajoPractico3ejercicio4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Gallina gallina1 = new Gallina(1, 2, 0);
        Gallina gallina2 = new Gallina(2, 1, 0);

        System.out.println("Estado inicial de las gallinas:");
        System.out.println("Gallina " + gallina1.getIdGallina() + " - Edad: " + gallina1.getEdad() + " años, Huevos: " + gallina1.getHuevosPuestos());
        System.out.println("Gallina " + gallina2.getIdGallina() + " - Edad: " + gallina2.getEdad() + " años, Huevos: " + gallina2.getHuevosPuestos());

        gallina1.setEdad(gallina1.getEdad() + 1);
        gallina1.setHuevosPuestos(gallina1.getHuevosPuestos() + 3);

        gallina2.setEdad(gallina2.getEdad() + 2);
        gallina2.setHuevosPuestos(gallina2.getHuevosPuestos() + 5);

        System.out.println("Estado final de las gallinas:");
        System.out.println("Gallina " + gallina1.getIdGallina() + " - Edad: " + gallina1.getEdad() + " años, Huevos: " + gallina1.getHuevosPuestos());
        System.out.println("Gallina " + gallina2.getIdGallina() + " - Edad: " + gallina2.getEdad() + " años, Huevos: " + gallina2.getHuevosPuestos());
    }
}
