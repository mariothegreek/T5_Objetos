package EjerciciosClase.Trigonometria;

public class Triangulo {

    //Tenga un constructor vacío
    public Triangulo(){
        //Constructor vacío.
    }

    //Tenga dos atributos tipo int, base y altura
    private int base, altura;


    //Un constructor con base y altura
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //Tenga un método que calcule su área (A=(b*al)/2)
    public void CalcularAreaTriangulo(int base, int altura){
        double areaTriangulo =(double) (base * altura) /2;
        System.out.println("El área del triángulo es: " + areaTriangulo);
    }

    //GETTERS n SETTERS
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
