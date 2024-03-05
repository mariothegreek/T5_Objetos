package EjerciciosClase.CajeroBase.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);

    private ArrayList<CuentaBanco> cuentasAsociadas;
    public Banco(String nombre) {
        this.cuentasAsociadas = new ArrayList<>();
        this.nombre = nombre;
    }

    //ATRIBUTOS
    private String nombre, CIF;

    public void abrirCuenta() {
        boolean crearExistente;
        String dni;
        do {
            crearExistente = true;
            System.out.println("Introcue DNI del titular");
            dni = sc.next();
            for (CuentaBanco item : cuentasAsociadas) {
                if (dni.equalsIgnoreCase(item.getDni())) {
                    System.out.println("Esta cuenta ya existe, ¿Quieres crear otra cuenta con este mismo DNI?");
                    System.out.println("1.SI\t 2.NO");
                    int opcionNuevaCuentaExistente= sc.nextInt();
                    if (opcionNuevaCuentaExistente != 1){
                        crearExistente= false;
                    }
                }
            }
        }while(!crearExistente);

        String pin;
        do {
            System.out.println("Introduce pin asociado");
            pin = sc.next();
            if (pin.length() != 4) {
                System.out.println("El PIN debe contener 4 dígitos");
            } else if (!pin.matches("[0-9]+")) {
                System.out.println("El PIN debe contener solo números");
            }
        } while (pin.length() != 4 || !pin.matches("[0-9]+"));

        int saldoInicial;
        do {
            System.out.println("Introduce saldo inicial");
            saldoInicial = sc.nextInt();
            if (saldoInicial < 0) {
                System.out.println("Has de introducir un saldo con valor positivo");
            }
        } while (saldoInicial < 0);
        CuentaBanco cuenta = new CuentaBanco(dni, pin, saldoInicial);
        this.cuentasAsociadas.add(cuenta);
        System.out.println("--Cuenta creada correctamente--");
    }

    public void cancelarCuenta() {
        System.out.println("Cuenta cancelada");
    }

    public void verCuentasCliente(String dni) {
        boolean cuentaEncontrada= false;
        for (CuentaBanco item : cuentasAsociadas) {
            if (dni.equalsIgnoreCase(item.getDni())){
                cuentaEncontrada= true;
                System.out.println("Las cuentas del cliente " + item.getDni() + " son:");
                System.out.println("ISBN:" + item.getIsbn());
                System.out.println("Saldo: " + item.getSaldoCuenta());
            }
        }
        if (!cuentaEncontrada){
            System.out.println("No hay cuentas asociadas a este cliente");
        }
    }

    public void verCuentasBanco(Banco banco){
        System.out.println("Las cuentas del banco "+banco.getNombre()+ " son:");
        for (CuentaBanco item : cuentasAsociadas){
            System.out.println("ISBN:" + item.getIsbn());
            System.out.println("Saldo: " + item.getSaldoCuenta());
        }
    }

   /* public CuentaBanco estaCuenta() {
        boolean encontrado;
        do {
            encontrado = false;
            for (CuentaBanco cuenta : cuentasAsociadas) {
                if (dni.equals(cuenta.getDni()) && pin.equals(cuenta.getPin())) {
                    encontrado = true;
                    System.out.println("Cuenta encontrada");
                    return cuenta;
                } else {
                    System.out.println("El cliente no aparece en la base de datos, prueba de nuevo");
                }
            }
            return null;
        } while (!encontrado);
    }*/

    //GETTERS N SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public ArrayList<CuentaBanco> getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    public void setCuentasAsociadas(ArrayList<CuentaBanco> cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }
}