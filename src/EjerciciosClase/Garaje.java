package EjerciciosClase;

public class Garaje {

    public Garaje() {
        //constructor vacío.
    }

    /*tres atributos, un coche, un String con la avería asociada y el número de coches
        que ha ido atendiendo.*/
    private Coche coche1;
    private String averiaAsociada;
    private int cochesAtendidos;

    public boolean aceptarCoche(Coche coche1, String averiaAsociada ){
        if (averiaAsociada.equalsIgnoreCase("aceite")){
            Motor motor1 = new Motor();
            int averiaAceite = motor1.getLitrosAceite()+10;
            System.out.printf("Se han añadido %d litros de aceite\n",averiaAceite);
            int precioAveria = (int) (Math.random()*500+500);
            System.out.printf("Precio total de avería: %d€ ",precioAveria);
            return true;
        }
        return false;
    }
}