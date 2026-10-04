//Alejandro Campos Martínez
//Programación Orientada a Objetos
// Clase Formulas

public class Formulas {                                         
    public static double perimetroCuadrado(double lado){              
        return 4 * lado;
    }
    public static double perimetroTriangulo(double lado1, double lado2, double lado3){
        return lado1 + lado2 + lado3;
    }
    public static double perimetroRectangulo(double lado1, double lado2){
        return 2 * (lado1 + lado2);
    }
    public static double areaCuadrado(double lado1) {
        return lado1 * lado1;
    }
    public static double areaTriangulo(double lado1, double altura) {
        return (lado1 * altura) / 2;
    }
    public static double areaRectangulo(double lado1, double lado2) {
        return lado1 * lado2;
    }
}


//Notas
//static se llama con el nombre de la clase, no crea el objeto
//double es el tipo de valor que devuelve el metodo.
//Lo demas son las operaciones aritmeticas. 