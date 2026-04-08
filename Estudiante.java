public class Estudiante {
    public String nombre;
    public String carrera;
    private int edad;
    private double promedio;
    public Estudiante(String nombre, String carrera, int edad, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.promedio = promedio;
    }
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
    public void mostrarInfo() {
        System.out.println("--- Datos Estudiante ---");
        System.out.println("Nombre: " + nombre + " | Carrera: " + carrera);
        System.out.println("Edad: " + edad + " | Es mayor: " + esMayorDeEdad());
        System.out.println("Promedio: " + promedio);
    }
}