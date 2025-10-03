package trabajopractico3ejercicio14;

import java.io.PrintStream;

class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre='" + nombre + '\'' + ", duracionMin=" + duracionMin + '}';
    }
}

class Render {
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato='" + formato + '\'' + ", proyecto=" + proyecto + '}';
    }
}

class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // Dependencia de creación
        System.out.println("🎬 Exportación realizada: " + render);
    }
}

public class TrabajoPractico3ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Proyecto proyecto = new Proyecto("Video Promocional", 10);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}
