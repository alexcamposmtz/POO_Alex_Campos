public class App {
    public static void main(String[] args) {

        //Crear tres objetos
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();

        //Asignar valores con los set
        e1.setMatricula("2026001");
        e1.setNombre("Ana López García");
        e1.setCarrera("Sistemas Computacionales");
        e1.setSemestre(2);

        e2.setMatricula("2026002");
        e2.setNombre("Carlos Ramírez Torres");
        e2.setCarrera("Sistemas Computacionales");
        e2.setSemestre(2);

        e3.setMatricula("2026003");
        e3.setNombre("María Fernanda Gómez");
        e3.setCarrera("Sistemas Computacionales");
        e3.setSemestre(2);

        //Imprimir con mostrarInformacion, get y obtenerNivelSemestre
        System.out.println("===== ESTUDIANTE 1 =====");
        e1.mostrarInformacion();
        System.out.println("Semestre: " + e1.getSemestre());
        System.out.println("Nivel: " + e1.obtenerNivelSemestre());

        System.out.println("\n===== ESTUDIANTE 2 =====");
        e2.mostrarInformacion();
        System.out.println("Semestre: " + e2.getSemestre());
        System.out.println("Nivel: " + e2.obtenerNivelSemestre());

        System.out.println("\n===== ESTUDIANTE 3 =====");
        e3.mostrarInformacion();
        System.out.println("Semestre: " + e3.getSemestre());
        System.out.println("Nivel: " + e3.obtenerNivelSemestre());
    }
}