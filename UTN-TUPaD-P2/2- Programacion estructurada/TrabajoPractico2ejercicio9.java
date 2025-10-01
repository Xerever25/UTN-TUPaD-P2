package trabajopractico2ejercicio9;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TrabajoPractico2ejercicio9 {

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo;
        if (zona.equalsIgnoreCase("Nacional")) {
            costo = 5 * peso;
        } else {
            costo = 10 * peso;
        }
        return costo;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
}
