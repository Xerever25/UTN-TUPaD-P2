package trabajopractico2ejercicio13;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico2ejercicio13 {

    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) return;
        System.out.println("Precio: $" + precios[indice]);
        mostrarPreciosRecursivo(precios, indice + 1);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        // Modificar un precio específico (por ejemplo, el tercer producto)
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
}
