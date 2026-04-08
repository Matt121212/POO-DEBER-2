public class Curso {
    public String nombre;
    public String codigo;
    private int creditos;
    private int horasSemanales;

    public Curso(String nombre, String codigo, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    public int calcularHorasTotales() {
        return this.horasSemanales * 16;
    }
    public void mostrarInfo() {
        System.out.println("--- Datos Curso ---");
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        System.out.println("Créditos: " + creditos + " | Horas Totales Semestre: " + calcularHorasTotales());
    }
}
