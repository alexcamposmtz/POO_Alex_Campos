//Alejandro Campos Martínez
//Programación Orientada a Objetos
//Clase Figura

//Atributos
public class Figura {                    //public me permite que otras clases la usen
    private double lado1;                // private es una encapsulamiento, que solo me permite leer o modificar
    private double altura;
    private double lado2;
    private double lado3;

    // constructores, se llaman igual que la clase y no tienen tipo de retorno
    //En double, los atributos quedan en ceros por defecto.
    public Figura(){

    }
        public Figura(double lado1) {
        this.lado1 = lado1;
    }

    public Figura(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Figura(double lado1, double lado2, double lado3,double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado1;
        this.altura = altura;
    }

    //Setters y getters
    //Set solo modifica el atributo, este void no me devuelve nada.
    //Get solo lee el aatributo, y devuelve el double con return.
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado3() {
        return lado3;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
}