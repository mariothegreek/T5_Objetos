import EjerciciosBase.Persona;
import EjerciciosClase.Coches.Coche;

public class EntradaPersona{
    public static void main(String[] args) {
        //Ejercicio 1 Base
       Persona persona1 = new Persona("Mario", "Harisis", "00000000X", 22, 170, 67.5);
        persona1.RellenarDatosEscaner();


        //Ejercicio 2 Base
        //Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
        Persona p1 = new Persona("nombre", "apellido");
        System.out.println("Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)");
        p1.setNombre("Julian");
        p1.setApellido("Romero");
        p1.MostrarDatos();

        //Crear una persona sin datos asociados
        System.out.println("Crear una persona sin datos asociados\n");
        Persona p0 = new Persona();

        //Mostrar los datos de todas las personas
        System.out.println("Mostrar los datos de todas las personas");
        persona1.MostrarDatos();
        p1.MostrarDatos();
        p0.MostrarDatos();

        //Modificar la edad de todas las personas a 20(Ejercicio2 Base)
        System.out.println("Modificar la edad de todas las personas a 20");
        persona1.setEdad(20);
        p1.setEdad(20);
        p0.setEdad(20);

        //Mostrar datos de todas las personas con edad cambiada a 20(Ejercicio2 Base)
        persona1.MostrarDatos();
        p1.MostrarDatos();
        p0.MostrarDatos();


        //Método para incrementar edad según parámetro(Ejercicio3 Base)
        persona1.IncrementarEdad(5);

        //Método para calcular el IMC, sacarlo por pantalla y diferenciar entre hombre y mujer(Ejercicio3, 4 y 5 Base)
        persona1.CalcularIMC();

        Coche coche1 = new Coche();
        coche1.acumularAveria(500);
    }
}