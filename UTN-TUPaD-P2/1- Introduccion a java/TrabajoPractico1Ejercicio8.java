package trabajopractico1ejercicio8;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico1Ejercicio8 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // Forzar UTF-8 en la consola
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Ingresa el primer número (double): ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número (double): ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2; // División decimal
            System.out.println("Resultado de la división decimal: " + resultado);
        } else {
            System.out.println("No se puede dividir entre 0");
        }

        scanner.close();
    }
}
