import EjerciciosClase.Coche;
import EjerciciosClase.Garaje;

public class Aplicacion {
    public static void main(String[] args) {
        Garaje GasMonkey = new Garaje();
        Coche Ferrari = new Coche();
        Coche Lamborghini = new Coche();
        GasMonkey.aceptarCoche(Ferrari,"aceite");
    }
}
