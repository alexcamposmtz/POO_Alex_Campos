public class Estudiante {
    private String matricula;
    private String nombre;
    private String carrera;
    private int semestre;

    public Estudiante() {
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }

    public String obtenerNivelSemestre() {
        if (semestre >= 1 && semestre <= 3) {
            return "Nivel básico";
        } else if (semestre >= 4 && semestre <= 6) {
            return "Nivel intermedio";
        } else if (semestre >= 7 && semestre <= 9) {
            return "Nivel avanzado";
        } else {
            return "Semestre no válido";
        }
    }
}