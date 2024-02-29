package ActEvaluable;

import java.util.ArrayList;

public class EntradaEvaluable {
    public static void main(String[] args) {
        //Crea dos coches con los datos que tú quieras.
        ArrayList<Coche> listaparticipantes = new ArrayList<>();
        Coche coche1 = new Coche(300, 3000, 0, 0, "Ferrari", "Spyder", "MatriculaFerrari");
        Coche coche2 = new Coche(99, 990, 0, 0, "BMW", "e21", "MatriculaBMW");
        Coche coche3 = new Coche(200,2000, 0, 0,"Ford", "Focus RS", "MatriculaFord");

        //Añadir corredores.
        listaparticipantes.add(coche1);
        listaparticipantes.add(coche2);
        listaparticipantes.add(coche3);

        //Crea una carrera con los datos que tú quieras.
        Carrera carrera = new Carrera();

        //Asocia los coches en la carrera.
        carrera.aceptarParticipante(coche1);
        carrera.aceptarParticipante(coche2);
        carrera.aceptarParticipante(coche3);

        //Inicia la carrera y comprueba que los datos sean correctos.
        carrera.iniciarCarrera(listaparticipantes);
    }
}