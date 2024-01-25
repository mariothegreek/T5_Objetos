package EjerciciosBase;

public class Persona {
    public Persona() {
    } //Constructor vacío


    /*Añadimos todos los atributos que queramos que contenga nuestra clase Persona
    Después mediante los constructores decidiremos si los utilizamos todos
    o solo los que queramos
     */
    private String nombre, apellido, dni; //Atributos en String
    private int edad; //Atributos en double
    private double peso, altura; //Atributos en double

    /*Constructor que imprime por consola todos los datos de la persona
    En este caso cuando queramos representarlo en otro archivo, no os hará falta
    hacer un sout, simplemente ejecutaríamos el método, por ejemplo: "persona.MostrarDatos();"
     */
    public void MostrarDatos() {
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(dni);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(peso);
    }


    /*Retornamos los datos que introduzcamos y los igualamos a ese mismo valor dentro del constructor
    Podemos utilizar Alt+Ins → Constructor, y crear el mismo código pero automáticamente
    Constructor con todos los datos referenciados al mismo.
     */
    public Persona(String nombre, String apellido, String dni, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
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
}