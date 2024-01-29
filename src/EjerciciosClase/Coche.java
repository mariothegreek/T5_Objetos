package EjerciciosClase;

public class Coche {
    public Coche(){
        //Constructor vacío
    }
    Motor motor1 = new Motor();


    //Tenga un atributo private de tipo Motor,
    private Motor cv;
    //Atributo de tipo String marca y modelo
    private String marca, modelo;

    //Atributo de tipo double con el precio acumulado con las averías.
    private double acumuladoAverias;


    //Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el modelo.
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //Tenga un getter para cada uno de los atributos.
    public Motor getCv() {
        return cv;
    }
     public String getMarca(){
        return marca;
     }
     public String getModelo(){
        return modelo;
     }
    public double getAcumuladoAverias() {
        return acumuladoAverias;
    }

    //Un método acumularAveria que incrementará el importe gastado en averías.
    public int acumularAveria(int averia){
        int importeAverias=0;
        if (averia>0){
            importeAverias+=averia;
        }
        System.out.println(importeAverias);
        return importeAverias;
    }
}
