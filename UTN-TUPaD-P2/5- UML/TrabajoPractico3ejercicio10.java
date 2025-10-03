package trabajopractico3ejercicio10;

import java.io.PrintStream;

class TitularCuenta {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociación bidireccional

    public TitularCuenta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "TitularCuenta{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + '}';
    }
}

class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo='" + codigo + '\'' +
                ", ultimaModificacion='" + ultimaModificacion + '\'' + '}';
    }
}

class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private TitularCuenta titular; // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, TitularCuenta titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        titular.setCuenta(this);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu='" + cbu + '\'' + ", saldo=" + saldo +
                ", clave=" + clave + ", titular=" + titular + '}';
    }
}

public class TrabajoPractico3ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        TitularCuenta titular = new TitularCuenta("Sofía Ramírez", "44556677");
        ClaveSeguridad clave = new ClaveSeguridad("XYZ123", "2025-09-15");
        CuentaBancaria cuenta = new CuentaBancaria("0001122334455", 150000.75, clave, titular);

        System.out.println(cuenta);
    }
}
