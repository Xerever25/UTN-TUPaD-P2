
package trabajopractico1ejercicio6;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico1Ejercicio6 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // Forzar UTF-8 en la consola
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        System.out.println("Nombre: Juan Pérez Edad: 30 años\nDirección: \"Calle Falsa 123\"");
    }
}

