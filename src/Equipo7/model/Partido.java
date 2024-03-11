package EjerciciosClase.Equipo7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

//Crear una clase partido que tenga los siguientes atributos;
public class Partido {

    //Dos atributos de tipo equipo.
    private Equipo equipo1, equipo2;

    //Un atributo de tipo boolean. Representa si el partido se está jugando o está terminado
    private boolean estadoPartido;

    //Un atributo de tipo int. Representa en que parte está
    private int minutoJuego;

    //Un constructor con los dos equipos pasados por parámetros.
    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    //Un método iniciarPartido: realiza tres ataques por cada parte.
    public void iniciarPartido(){
        for (int i = 0; i < 3; i++) {
            equipo1.atacar();
            equipo2.atacar();
        }

        System.out.println("El resultado es "+equipo1.getNombre()+equipo1.getGoles()+"-"+equipo2.getGoles()+equipo2.getNombre());
    }
}