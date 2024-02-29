package ActEvaluable;

import java.util.Scanner;

public class Coche {
    public Coche() {
        //Constructor vacío.
    }

    //ATRIBUTOS

    /*Tendrá como características una marca, modelo, cv, cc, matrícula,
    velocidad y km recorridos*/
    private int cv, cc, velocidad, kmrecorridos;

    private String marca, modelo, matricula;

    public Coche(int cv, int cc, int velocidad, int kmrecorridos, String marca, String modelo, String matricula) {
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.kmrecorridos = kmrecorridos;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    /*Como capacidades, un coche puede acelerar.
    Establezco unos km estándar para la aceleración, así la carrera es justa, ya que por cada turno
    que se da, cada corredor tiene las mismas posibilidades de acelerar, cada uno con su potencia.
     */
    public void acelerar(int kmAcelerar) {
        /*Aunque también se podría hacer con un Scanner en el que le preguntemos a cada corredor
        cuantos km quisiera acelerar.
        Scanner sc = new Scanner(System.in);
        int kmAcelerar = sc.nextInt();*/

        //Mostramos los datos para saber cómo va avanzando cada corredor.
        mostrarDatos();


        //Condición para los cálculos que establecen cuánto acelerará el coche.
        if (cv >= 100) {
            velocidad += (int) (Math.random() * kmAcelerar) + 10;
            int kmAcelerados = (int) (velocidad * 0.5);
            System.out.println("La velocidad es de " + velocidad);
            System.out.println("Se han recorrido " + (getKmrecorridos() + kmAcelerados) + "km");
            kmrecorridos += (int) (velocidad * 0.5);

        } else {
            velocidad += (int) (Math.random() * kmAcelerar);
            kmrecorridos = (int) (velocidad * 0.5);
            System.out.println("La velocidad es de " + velocidad);
            System.out.println("Se han recorrido " + kmrecorridos + "km");
        }
        System.out.println();
    }

    //Método para mostrar los datos.
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matricula: " + matricula);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Km recorridos: " + kmrecorridos);
    }

    //GETTERS N SETTERS
    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKmrecorridos() {
        return kmrecorridos;
    }

    public void setKmrecorridos(int kmrecorridos) {
        this.kmrecorridos = kmrecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}