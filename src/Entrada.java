import EjerciciosBase.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mario","Harisis","02299646Z",22,1.7,67);
        persona1.MostrarDatos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce apellido");
        String apellido1 = sc.next();
        System.out.println("Introduce tu nombre");
        String nombre1 = sc.next();
        System.out.println("Introduce dni");
        String dni1 = sc.next();
    }
}