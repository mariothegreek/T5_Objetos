import EjerciciosClase.Trigonometria.Circulo;
import EjerciciosClase.Trigonometria.Cuadrado;
import EjerciciosClase.Trigonometria.Triangulo;

import java.util.Scanner;

public class EntradaTrigonometria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Desarrollar una clase entrada donde:
         Se cree una figura de cada tipo,
         pasando los datos necesarios para el cálculo de la base y perímetro.

         Calcula cada uno de los datos mostrando el mensaje "La base del rectángulo es: XXX"
         */

        Triangulo triangulo1 = new Triangulo();
        //Triangulo y su area calculada.
        triangulo1.CalcularAreaTriangulo(15, 50);

        Circulo circulo1 = new Circulo(3);
        //Círculo, su área y diámetro calculados.
        circulo1.CalcularAreaCirculo(87);
        circulo1.CalcularDiametroCirculo(60);

        Cuadrado cuadrado1 = new Cuadrado();
        //Cuadrado, área y perímetro calculados.
        cuadrado1.CalcularAreaCuadrado(40, 60);
        cuadrado1.CalcularPerimetroCuadrado(50, 20);

        System.out.println("Bienvenido al menú de operaciones");
        System.out.println("¿Con qué figura deseas trabajar?");
        System.out.println("1.- Trabajar con triángulos.");
        System.out.println("2.- Trabajar con círculos.");
        System.out.println("3.- Trabajar con cuadrados.");
        boolean opcionCorrecta = false;
        int opcion;
        do {
            opcion = sc.nextInt();
            if (!(opcion == 1 || opcion == 2 || opcion == 3)) {
                System.out.println("Escoge una opción válida");
            } else {
                opcionCorrecta = true;
            }

        } while (!opcionCorrecta);


        switch (opcion) {
            case 1:
                System.out.println("Introduce base");
                int baseTriangulo = sc.nextInt();
                System.out.println("Introduce altura");
                int alturaTriangulo = sc.nextInt();
                int operacionTriangulo;
                boolean opcionCorrectaTriangulo = false;
                do {
                    System.out.println("¿Qué operación quieres hacer?\n 1.-Calcular area \n 2.-Mostrar datos\n");
                    operacionTriangulo = sc.nextInt();
                    if (operacionTriangulo == 1) {
                        triangulo1.CalcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                        opcionCorrectaTriangulo = true;
                    } else if (operacionTriangulo == 2) {
                        System.out.printf("La base es %d\nLa altura es %d\n", baseTriangulo, alturaTriangulo);
                        opcionCorrectaTriangulo = true;
                    } else {
                        System.out.println("Escoge una opción válida");
                    }
                    break;
                } while (!opcionCorrectaTriangulo);

            case 2:
                System.out.println("Introduce radio");
                double radioCirculo = sc.nextDouble();
                int opcionCirculo;
                boolean opcionCorrectaCirculo = false;
                do {
                    System.out.println("¿Qué operación quieres hacer?\n1.-Calcular area\n2.-Calcular diametro\n3.-Mostrar datos");
                    opcionCirculo = sc.nextInt();
                    if (opcionCirculo == 1) {
                        opcionCorrectaCirculo = true;
                        circulo1.CalcularAreaCirculo(radioCirculo);
                    } else if (opcionCirculo == 2) {
                        opcionCorrectaCirculo = true;
                        circulo1.CalcularDiametroCirculo(radioCirculo);
                    } else if (opcionCirculo == 3) {
                        opcionCorrectaCirculo = true;
                        System.out.println("El radio del circulo es: " + radioCirculo);
                    } else {
                        System.out.println("Elige una opción válida");
                    }
                    break;

                } while (!opcionCorrectaCirculo);

            case 3:
                System.out.println("Introduce base");
                int baseCuadrado = sc.nextInt();
                System.out.println("Introduce altura");
                int alturaCuadrado = sc.nextInt();
                int opcionCuadrado;
                boolean opcionCorrectaCuadrado = false;
                do {
                    System.out.println("¿Qué operación quieres hacer?\n1.-Calcular area\n2.-Calcular perímetro\n3.-Mostrar datos");
                    opcionCuadrado = sc.nextInt();
                    if (opcionCuadrado == 1) {
                        opcionCorrectaCuadrado = true;
                        cuadrado1.CalcularAreaCuadrado(baseCuadrado, alturaCuadrado);
                    } else if (opcionCuadrado == 2) {
                        opcionCorrectaCuadrado = true;
                        cuadrado1.CalcularPerimetroCuadrado(alturaCuadrado, baseCuadrado);
                    } else if (opcionCuadrado == 3) {
                        opcionCorrectaCuadrado = true;
                        System.out.printf("La base es: %d\nLa altura es: %d\n", baseCuadrado, alturaCuadrado);
                    } else {
                        System.out.println("Elige una opción válida");
                    }
                    break;

                } while (!opcionCorrectaCuadrado);
        }
    }
}