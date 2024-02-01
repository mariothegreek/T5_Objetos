package EjerciciosClase.Trigonometria;

public class Circulo {


    //Tenga un constructor vacío.
    public Circulo(){
        //Constructor vacío.
    }

    //Y un constructor con radio.
    public Circulo(int radio) {
        this.radio = radio;
    }

    //ATRIBUTOS

    //Tenga tres atributo de tipo double radio, diámetro y área
    private double radio, diametro, area;

    //Tenga un método donde se calcule el área (A=Pi*r2)
    public void CalcularAreaCirculo(double radio){
        double areaCirculo= Math.PI*Math.pow(radio,2);
        System.out.println("El área del círculo es: " + areaCirculo);
    }

    //Tenga un método donde se calcule el diámetro (D = 2*r)
    public void CalcularDiametroCirculo(double radio) {
        double diametroCirculo = radio*2;
        System.out.println("El diámetro del círculo es: " + diametroCirculo);
    }


    //GETTERS n SETTERS
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getArea() {
        return area;
    }
}
