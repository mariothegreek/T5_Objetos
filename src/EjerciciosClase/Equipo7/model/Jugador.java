package EjerciciosClase.Equipo7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Jugador {

    // - Atributo de tipo String (nombre), atributo de tipo String (posición).
    private String nombre, posicion;

    //Atributo de tipo boolean (estrella)
    private boolean estrella;

    //Atributo de tipo int (calidad)
    private int calidad;

    /* Crear un constructor que pida por parámetro un nombre, una posición, y una calidad.
    Se iniciará los atributos a los parámetros pasados.
    El atributo estrella será true si la calidad es superior a 90, si no será false. */
    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        this.estrella = calidad > 90;
    }
     public void mostrarDatos(){
         System.out.println("Nombre: "+nombre);
         System.out.println("Posición: "+posicion);
         System.out.println("Calidad: "+calidad);
         System.out.println("Estrella: "+estrella);
     }
}
