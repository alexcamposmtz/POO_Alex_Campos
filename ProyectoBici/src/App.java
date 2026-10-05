//Alejandro Campos Martínez
//4 de octubre de 2026

public class App {
    public static void main(String[] args) {

        //Un objeto por cada constructor
        Bicicleta bici1 = new Bicicleta();
        Bicicleta bici2 = new Bicicleta("WeThePeople", "Ruta", 8500.50);
        Bicicleta bici3 = new Bicicleta("BSD", "Rojo", 3, "Montaña", 12000.0);

        //Setters para los datos que le faltan a cada objeto
        bici1.setMarca("Mongoose:");
        bici1.setColor("Negro");
        bici1.setNumeroDeCoronas(2);
        bici1.setDeporte("BMX Freestyle");
        bici1.setPrecio(6500.0);

        bici2.setColor("Azul");
        bici2.setNumeroDeCoronas(2);

        //pasear sobrecargado
        bici1.pasear();
        bici2.pasear("el parque lineal");
        bici3.pasear("la ciudad");

        //Datos con toString
        System.out.println(bici1.toString());
        System.out.println(bici2.toString());
        System.out.println(bici3.toString());
    }
}