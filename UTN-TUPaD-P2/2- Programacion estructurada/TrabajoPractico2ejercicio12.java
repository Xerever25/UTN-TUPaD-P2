package trabajopractico2ejercicio12;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico2ejercicio12 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // Modificar un precio específico (por ejemplo, el tercer producto)
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
