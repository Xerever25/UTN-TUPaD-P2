package trabajopractico2ejercicio3;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico2ejercicio3 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // Forzar UTF-8 en la consola
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor.");
        } else {
            System.out.println("Edad inválida.");
        }

        sc.close();
    }
}
