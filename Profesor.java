public class Profesor {

    public String nombre;
    public String titulo;
    private double salarioBase;
    private int añosExperiencia;

    public Profesor(String nombre, String titulo, double salarioBase, int añosExperiencia) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.salarioBase = salarioBase;
        this.añosExperiencia = añosExperiencia;
    }

    public void mostrarInfo() {
        System.out.println("--- Datos Profesor ---");
        System.out.println("Profesor: " + nombre + " | Título: " + titulo);
        System.out.println("Experiencia: " + añosExperiencia + " años");
    }
}