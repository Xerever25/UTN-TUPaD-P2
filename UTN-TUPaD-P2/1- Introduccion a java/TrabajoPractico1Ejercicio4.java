package trabajo.practico.pkg1.ejercicio.pkg4;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico1Ejercicio4 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad + " años");

        scanner.close();
    }
}
