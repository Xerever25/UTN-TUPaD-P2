package trabajopractico2ejercicio2;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico2ejercicio2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // Forzar UTF-8 en la consola
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
        
        int mayor = Math.max(num1, Math.max(num2, num3));

        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}
