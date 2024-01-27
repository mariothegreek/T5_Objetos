package EjerciciosBase;

import java.util.Scanner;

public class Persona {

    public Persona() {
    //Constructor vacío.
    }


    /*Añadimos todos los ATRIBUTOS que queramos que contenga nuestra clase Persona
    Después mediante los constructores decidiremos si los utilizamos todos
    o solo los que queramos
     */
    private String nombre, apellido, dni; //Atributos en String
    private int edad; //Atributos en double
    //Atributos en double
    private double peso, altura, imc;

    /*Constructor que imprime por consola todos los datos de la persona
    En este caso cuando queramos representarlo en otro archivo, no os hará falta
    hacer un sout, simplemente ejecutaríamos el método, por ejemplo: "persona.MostrarDatos();"
     */
    public void MostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }


    /*Retornamos los datos que introduzcamos y los igualamos a ese mismo valor dentro del constructor
    Podemos utilizar Alt+Ins → Constructor, y crear el mismo código pero automáticamente
    Constructor con todos los datos referenciados al mismo.
     */
    public Persona(String nombre, String apellido, String dni, int edad, double altura, double peso) {
        //Crear una persona sin datos asociados(Ejercicio2 Base)
    }

    //Constructor con nombre y apellido, establece DNI con un valor y lo demás en 0.(Ejercicio 1 Base)
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "11111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
    }

    //Constructor sin peso ni altura.(Ejercicio 1 Base)
    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    /*Constructor que permita crear una persona con nombre y apellidos,
    el resto de datos los pondrá a 0,excepto el dni que lo pondrá a 111111111X*/
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "11111111X";
        this.altura = 0;
        this.peso = 0;
    }

    //Método para mostrar el nombre.(Ejemplo clase)
    public void MostrarNombre() {
        System.out.println(nombre);
    }

    //Método para cambiar el nombre.(Ejemplo clase)
    public void cambioNombre(String nombre) {
        this.nombre = nombre;
    }


    //ALL GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    //Scanner que pide nombre, apellido, dni, edad, peso y altura de una persona(Ejercicio2 Base)
    public void RellenarDatosEscaner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        this.nombre = sc.next();
        System.out.println("Introduce tu apellido");
        this.apellido = sc.next();
        System.out.println("Introduce tu dni");
        this.dni = sc.next();
        System.out.println("Introduce tu edad");
        this.edad = sc.nextInt();
        System.out.println("Introduce tu peso");
        this.peso = sc.nextDouble();
        System.out.println("Introduce tu altura");
        this.altura = sc.nextDouble();
    }


    //Método que incrementa la edad según parámetro(Ejercicio3 Base)
    public void IncrementarEdad(int incremento){
        edad = edad+incremento;
        System.out.println(edad);
    }

    //Método que calcula el IMC(Ejercicio3 Base)
    public void CalcularIMC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular tu IMC!");
        boolean generoCorrecto;
        String genero;
        do {
            System.out.print("Eres hombre o mujer?");
            genero = sc.next();
            generoCorrecto = true;
            if (!genero.equalsIgnoreCase("hombre") && !genero.equalsIgnoreCase("mujer")){
                generoCorrecto=false;
                System.out.println("Género no contemplado, por favor elige una opción.");
            }
        }while (!generoCorrecto);

        System.out.print("Introduce tu peso en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (Math.pow(2, altura));
        System.out.println("El IMC es de: " + imc);

        if (genero.equalsIgnoreCase("hombre")){
            if (imc >= 30 && imc<=40) {
                System.out.println("Obesidad entre hombres");
            } else if (imc>=27 && imc<=30) {
                System.out.println("Peso superior al normal entre hombres");
            } else if (imc>=20 && imc<27) {
                System.out.println("Normopeso entre hombres");
            } else if (imc<20) {
                System.out.println("Peso inferior al normal entre hombres");
            } else if (imc>40) {
                System.out.println("Obesidad mórbida entre hombres");
            }else{
                System.out.println("Cálculos no contemplados dentro de parámetros");
            }
        }else{
            if (imc >= 30 && imc<=40 && genero.equalsIgnoreCase("mujer")) {
                System.out.println("Obesidad ente mujeres");
            } else if (imc>=20 && imc<=25) {
                System.out.println("Normopeso entre mujeres");
            } else if (imc>=25 && imc<=30) {
                System.out.println("Sobrepeso entre mujeres");
            } else if (imc<20) {
                System.out.println("Peso inferior al normal entre mujeres");
            } else if (imc>40) {
                System.out.println("Obesidad mórbida entre mujeres");
            }else{
                System.out.println("Cálculos no contemplados dentro de parámetros");
            }
        }
    }

    /*Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
    (Ejercicio2 Base)*/
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}