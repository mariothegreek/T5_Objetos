package EjerciciosClase.CajeroBase.model;

import java.util.Scanner;

public class CuentaBanco {
    Scanner sc = new Scanner(System.in);
    public CuentaBanco() {
        //Constructor vacío.
    }

    private String dni, pin;

    private int saldoCuenta, isbn;

    public CuentaBanco(String dni, String pin, int saldoCuenta) {
        this.dni = dni;
        this.pin = pin;
        this.saldoCuenta = saldoCuenta;
        this.isbn= (int) (Math.random()*10000);
    }

    public void ingresarDinero() {
        boolean saldoCorrecto;
        do {
            saldoCorrecto = false;
            System.out.println("Introduce saldo a ingresar");
            int ingresarSaldo = sc.nextInt();
            if (ingresarSaldo < 0) {
                System.out.println("Debe ingresar un saldo positivo.");
            } else {
                saldoCorrecto = true;
                saldoCuenta += ingresarSaldo;
            }
        } while (!saldoCorrecto);
        System.out.println("Saldo actual: "+saldoCuenta);
    }

    public void retirarDinero() {
        System.out.println("Introcue DNI del titular");
        this.dni = sc.next();
        do {
            System.out.println("Introduce pin asociado");
            pin = sc.next();
            if (pin.length() !=4){
                System.out.println("El PIN debe contener 4 dígitos");
            } else if (!pin.matches("[0-9]+")) {
                System.out.println("El PIN debe contener solo números");
            }
        } while (pin.length() != 4 || !pin.matches("[0-9]+"));
        System.out.println("Actualmente el saldo en la cuenta es de: " + saldoCuenta);

        boolean saldoCorrecto;
        do {
            saldoCorrecto = false;
            System.out.println("Introduce saldo a retirar");
            int retirarSaldo = sc.nextInt();
            if (retirarSaldo>saldoCuenta || retirarSaldo<0){
                System.out.println("La cuenta no permite tener números rojos o introducir números negativos");
            }else{
                saldoCuenta-=retirarSaldo;
                saldoCorrecto= true;
            }
        } while (!saldoCorrecto);
        System.out.println("Saldo restante: "+saldoCuenta);
    }
    public void mostrarDatosCuenta(){
        System.out.println(isbn);
    }

    // GETTERS N SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}