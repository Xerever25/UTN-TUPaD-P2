package trabajopractico4;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int contadorId = 1;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        contadorId = Math.max(contadorId, id + 1);
    }

    public Empleado(String nombre, String puesto) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; 
        totalEmpleados++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void actualizarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        salario += aumentoFijo;
    }

    @Override
    public String toString() {
        return "Empleado { ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + " }";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}

public class TrabajoPractico4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Empleado emp1 = new Empleado(1, "Ana López", "Desarrolladora", 80000);
        Empleado emp2 = new Empleado("Carlos Pérez", "Tester");
        Empleado emp3 = new Empleado("María Gómez", "Analista");

        emp1.actualizarSalario(10);  
        emp2.actualizarSalario(5000); 
        emp3.actualizarSalario(15);  

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
