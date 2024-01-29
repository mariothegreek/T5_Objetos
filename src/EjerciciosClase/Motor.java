package EjerciciosClase;
//EJERCICIO 1CLASE(COCHE)
public class Motor {

    public Motor(){
        //Constructor vacío.
    }

    private int litrosAceite, cv;

    public Motor(int cv){
        this.cv = cv;
        this.litrosAceite =0;
    }

    //GETTER n SETTERS

    public void setLitrosAceite(int litrosAceite){
        this.litrosAceite = litrosAceite;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }
}
