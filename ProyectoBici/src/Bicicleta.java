//Alejandro Campos Martínez
//4 de octubre de 2026

public class Bicicleta {
    private String marca;
    private String color;
    private String deporte;
    private int numeroDeCoronas;
    private double precio;
    //private String pasear;

    public Bicicleta(){

    }
        public Bicicleta(String marca, String deporte, double precio){
            this.marca = marca;
            this.deporte = deporte;
            this.precio = precio;
        }

        public Bicicleta(String marca, String color, int numeroDeCoronas, String deporte, double precio){
            this.marca=marca;
            this.color = color;
            this.numeroDeCoronas = numeroDeCoronas;
            this.deporte = deporte;
            this.precio = precio;
        }
   
        public void setMarca(String marca){
            this.marca = marca;
        }

        public String getMarca(){
            return marca;
        }

        public void setColor(String color){
            this.color = color;
        }

        public String getColor(){
            return color;
        }

        public void setDeporte(String deporte){
            this.deporte = deporte;
        }

        public String getDeporte(){
            return deporte;
        }

        public void setNumeroDeCoronas(int numeroDeCoronas){
            this.numeroDeCoronas = numeroDeCoronas;
        }

        public int getNumeroDeCoronas(){
            return numeroDeCoronas;
        }

        public void setPrecio(double precio){
            this.precio = precio;
        }

        public double getPrecio(){
            return precio;
        }

        public void pasear(String lugar){
            System.out.println("Estoy paseando en la bicicleta por " + lugar);
         }

        public void pasear() {
            System.out.println("Estoy paseando en la bicicleta");
        }

        public String toString() {
            return "Bicicleta [marca=" + marca + ", color=" + color
                    + ", numeroDeCoronas=" + numeroDeCoronas
                    + ", deporte=" + deporte + ", precio=" + precio + "]";
        }
    }
