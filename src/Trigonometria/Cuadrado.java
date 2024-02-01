package EjerciciosClase.Trigonometria;

public class Cuadrado {
    public Cuadrado(){
        //Constructor vacío
    }

    //ATRIBUTOS

    //Tenga dos atributos int base y altura
    private int base, altura;

    //Tenga dos atributos de tipo double área y perímetro
    private double area, perimetro;


 //Un constructor con base y altura
    public Cuadrado(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //Tenga un método que calcule su área (A=b*a)
    public void CalcularAreaCuadrado(int base, int altura){
        int area = base*altura;
        System.out.println("El área del cuadrado es: " + area);
    }

    //Tenga un método que calcule su perímetro (2a+2b)
    public void CalcularPerimetroCuadrado(int altura, int base){
        perimetro= 2*(base+altura);
        System.out.println("El perímetro del cuadrado es: "+perimetro);
    }


    //GETTERS n SETTERS
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
