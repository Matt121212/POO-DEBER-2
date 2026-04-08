public class UniversidadApp {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Mateo", "Desarrollo de Software", 20, 9.5);
        Curso curso1 = new Curso("Programación Orientada a Objetos", "SW-302", 4, 6);
        Profesor prof1 = new Profesor("Ing. Carlos Andrade", "Magíster en Sistemas", 1500.0, 10);

        est1.mostrarInfo();
        System.out.println();
        curso1.mostrarInfo();
        System.out.println();
        prof1.mostrarInfo();
    }
}