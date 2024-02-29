package ActEvaluable;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {

    /*Tendrá como características dos coches que actuarán como
    participantes, un ganador que inicialmente estará en vacío*/
    private Coche coche1, coche2, ganador;
    /*Además, contará con una característica kmTotales y número de vueltas*/
    private int kmTotales, numeroVueltas;
    private ArrayList<Coche> listaparticipantes;

    //Constructor en el que podemos meter el ArrayList
    public Carrera() {
        this.listaparticipantes = new ArrayList<Coche>();
    }

    public void aceptarParticipante(Coche coche) {
        this.listaparticipantes.add(coche);
    }


    /*Como funcionalidad tendrá un método iniciar carrera*/
    public void iniciarCarrera(ArrayList<Coche> listaparticipantes) {
        Scanner sc = new Scanner(System.in);

        /*He decidido hacer el número de vueltas por Scanner, ya que en muchos juegos
        te dan la opción de elegir el número de vueltas uq quieres dar al circuito*/
        System.out.println("El circuito tiene una longitud de 8km \n¿Cuantas vueltas quieres que tenga la carrera?");
        int numeroVueltas = sc.nextInt();
        int longitudcarrera = numeroVueltas * 150;
        System.out.println();

        /*Antes de iniciar la carrera se mostrará un mensaje con los datos de
        ambos participantes*/
        System.out.println("Esta es nuestra lista de participantes!");
        System.out.println();
        mostrarCorredores(listaparticipantes);

        boolean gameover = false;

        System.out.println("COMIENZA LA CARRERA!");
        System.out.println();
        /*Este do while quiere decir que en caso de que ninguno de los coches llegue a los km que contiene la carrera
        se va a seguir repitiendo hasta que uno de ellos lo consiga*/
        do {
            /*Seguidamente, cada participante realizará tantas aceleraciones
        como vueltas indique el circuito*/
            for (int i = 0; i < numeroVueltas; i++) {
                for (Coche coche : listaparticipantes) {
                    coche.acelerar(30);//Aquí es donde podríamos cambiar el 30 por la opción del Scanner.
                    if (coche.getKmrecorridos() >= longitudcarrera) {
                        gameover = true; //Establecemos que termine la carrera cuando uno de los coches llegue a los km.
                        System.out.printf("Felicidades corredor " + coche.getMatricula() + " Has ganado la carrera!");
                        break; //Y paramos el bucle.
                    }
                }
                if (gameover) {
                    break; //Implementamos una segunda parada para el bucle exterior.
                }
            }
        } while (!gameover); //Condición para que se siga ejecutando mientras no exista un gameover.
    }

    //Método para mostrar los participantes de la carrera.
    public void mostrarCorredores(ArrayList<Coche> listaparticipantes) {
        for (Coche coche : listaparticipantes) {
            coche.mostrarDatos();
            System.out.println();
        }
    }

    //GETTERS AND SETTERS
    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }
}