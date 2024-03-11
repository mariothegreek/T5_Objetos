package EjerciciosClase.Equipo7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

//Uso de la librería Lombok.
@AllArgsConstructor //Constructor con todos los argumentos.
@NoArgsConstructor //Constructor vacío.
@Getter //Todos los getter.
@Setter //todos los setter.
public class Equipo {

    //Un atributo de tipo String que sea el nombre.
    private String nombre;

    //Tres atributos de tipo int que sean el nivelAtaque, nivelCentro, nivelDefensa y goles.
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;

    //Un atributo de tipo Arraylist que se inicialice a vacío en todos los constructores.
    private ArrayList<Jugador>listaJugadores;


    /* - Un constructor que pida por parámetros un nombre y que tenga la siguiente funcionalidad:
    - Inicialice el nombre al pasado por parámetros
    - Inicialice el nivel de ataque a un número aleatorio entre 0 y 100
    - Inicialice el nivel de centro a un número aleatorio entre 0 y 100
    - Inicialice el nivel de defensa a un número aleatorio entre 0 y 100
    - Inicialice los goles a 0 */
    public Equipo(String nombre){
        this.listaJugadores = new ArrayList<>();
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random()*101);
        this.nivelCentro = (int) (Math.random()*101);
        this.nivelDefensa = (int) (Math.random()*101);
        this.goles = 0;
    }

    /* - Un constructor que pida por parámetros un storing (nombre) y tres enteros (niveles de ataque medio y defensa) y que tenga la siguiente funcionalidad:
    - Inicialice el nombre al pasado por parámetros
    - Inicialice el nivel de ataque al número pasado
    - Inicialice el nivel de centro al número pasado
    - Inicialice el nivel de defensa al número pasado */

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.listaJugadores = new ArrayList<>();
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
    }

    /* - Un método atacar que no reciba nada por parámetros y retorne un booleano. La funcionalidad será la siguiente
    - Retornará true (se ha metido gol) si el resultado de la operación
    de (nivelAtaque * (aleatorio entre 0-1) + (nivelCentro * aleatorio entre 0-1)/2) es superior a 90.
     Además, sumará uno a la variable goles
    - Retornará false en el resto de los casos */

    public boolean atacar (){

        double resultado = (nivelAtaque*Math.random())+(nivelCentro*Math.random())/2;

        if (resultado>90){
            goles++;
            System.out.println("Se ha metido "+goles +" gol/es");
            return true;
        }else {
            return false;
        }
    }

    /*Un método que no devuelva nada y que pida por parámetros un objeto de tipo jugador.
    El método agregará a la lista de jugadores el pasado por parámetros*/
    public void ficharJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }

    //Un método que sea listarDelateros que no devuelva nada y muestre por consola los datos de los delanteros.
    public void listarDelanteros(){

    }
}