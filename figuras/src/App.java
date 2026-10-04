//Alejandro Campos Martínez
//Programación Orientada a Objetos
//3 de octubre de 2026


public class App {                              //Clase principal, aqui se prueba todo el proyecto
    
    public static void main(String[] args) {    //static permite que java lo ejecute sin crear un objeto de App
        Figura cuadrado = new Figura(4);                                    // constructor de 1 parametro
        Figura triangulo = new Figura(3, 4, 5, 2.4);    // constructor de 4 parametros
        Figura rectangulo = new Figura(6, 3);                                      //  constructor de 2 parametros
        //Nota: Se crean los objetos, new invoca al constructor y Java elige cual segun los argumentos que le damos. 

        // Se imprimen en terminal los valores con get, los atributos son private, por eso los leemos con get. concatenamos el texto con los valores.
        System.out.println("Cuadrado: lado1 = " + cuadrado.getLado1());
        System.out.println("Triangulo: lado1 = " + triangulo.getLado1()
                + ", lado2 = " + triangulo.getLado2()
                + ", lado3 = " + triangulo.getLado3()
                + ", altura = " + triangulo.getAltura());
        System.out.println("Rectangulo: lado1 = " + rectangulo.getLado1());

        //Aqui reemplazamos valores de cada atributo con los set
        cuadrado.setLado1(7);
        triangulo.setLado1(6);
        triangulo.setLado2(8);
        triangulo.setLado3(10);
        triangulo.setAltura(4.8);
        rectangulo.setLado1(10);
        rectangulo.setLado2(5);
        
        // se imprime de nuevo en la terminal para comprobar el funcionamiento de los set
        System.out.println("\n");
        System.out.println("Valores");
        System.out.println("Cuadrado: Lado1 = " + cuadrado.getLado1());
        System.out.println("Triangulo: lado2 = " + triangulo.getLado1()
                + ", lado2 = " + triangulo.getLado2()
                + ", lado3 = " + triangulo.getLado3()
                + ", altura = " + triangulo.getAltura());
        System.out.println("Rectangulo: Lado1 = " + rectangulo.getLado1()
                + ", lado2 = " + rectangulo.getLado2());

                //Imprimimos los resultados de las operaciones aritmeticas (calculos areas y perimetros)
                //Los valores salen de los objetos usando los get y se pasan como argumentos a la formula
        System.out.println("\nPerimetros y areas");
        System.out.println("Cuadrado:   perimetro = "
                + Formulas.perimetroCuadrado(cuadrado.getLado1())
                + ", area = " + Formulas.areaCuadrado(cuadrado.getLado1()));
        System.out.println("Triangulo:  perimetro = "
                + Formulas.perimetroTriangulo(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3())
                + ", area = " + Formulas.areaTriangulo(triangulo.getLado1(), triangulo.getAltura()));
        System.out.println("Rectangulo: perimetro = "
                + Formulas.perimetroRectangulo(rectangulo.getLado1(), rectangulo.getLado2())
                + ", area = " + Formulas.areaRectangulo(rectangulo.getLado1(), rectangulo.getLado2()));
        }
    }

//NOTA
//Revisar con el profesor mi resultado "Triangulo:  perimetro = 24.0, area = 14.399999999999999"
//para ver como se aplica redondeo, supongo que hay una funcion para esto.