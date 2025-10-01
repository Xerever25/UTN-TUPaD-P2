package trabajopractico2ejercicio1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico2ejercicio1 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // Forzar UTF-8 en la consola
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        sc.close();
    }
}
