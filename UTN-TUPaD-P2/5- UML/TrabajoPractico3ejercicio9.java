package trabajopractico3ejercicio9;

import java.io.PrintStream;

class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre='" + nombre + '\'' + ", obraSocial='" + obraSocial + '\'' + '}';
    }
}

class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesional{" + "nombre='" + nombre + '\'' + ", especialidad='" + especialidad + '\'' + '}';
    }
}

class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;      // Asociación unidireccional
    private Profesional profesional; // Asociación unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha='" + fecha + '\'' + ", hora='" + hora + '\'' +
                ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }
}

public class TrabajoPractico3ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Paciente paciente = new Paciente("Roberto López", "OSDE");
        Profesional profesional = new Profesional("Dra. Fernández", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-11-01", "15:30", paciente, profesional);

        System.out.println(cita);
    }
}
