package EjerciciosClase.CajeroBase;

import EjerciciosClase.CajeroBase.model.Banco;
import EjerciciosClase.CajeroBase.model.CuentaBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aplicacion app = new Aplicacion();

        int opcionBanco;

        do {
            System.out.println("Introduce el banco con el que quieres operar\n1. BBVA\n2. Santander");
            try {
                opcionBanco = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor introduce solo un numero");
                sc.next();
            }
        } while (true);

        if (opcionBanco == 1) {
            Banco BBVA = new Banco("BBVA");
            app.menuBanco(BBVA);
        } else if (opcionBanco == 2) {
            Banco Santander = new Banco("Santander");
            app.menuBanco(Santander);
        }
    }

    public void menuBanco(Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Banco " + banco.getNombre() + " seleccionado --");
        boolean salir;
        do {
            salir = false;
            int operacionSeleccionada;
            do {
                System.out.println("""
                        MENÚ PRINCIPAL
                                            
                        1. Crear cuenta
                        2. Ingresar dinero
                        3. sacar dinero
                        4. Ver cuentas de un cliente
                        5. Ver todas las cuentas
                        Que quieres hacer:""");

                try {
                    operacionSeleccionada = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor introduce solo un numero");
                    sc.next();
                }
            } while (true);

            switch (operacionSeleccionada) {
                case 1:
                    System.out.println("--Seleccionado crear cuenta");
                    banco.abrirCuenta();
                    break;
                case 2:
                    System.out.println("--Seleccionado ingresar dinero");
                    if (banco.getCuentasAsociadas().isEmpty()) {
                        System.out.println("No hay cuentas disponibles para realizar operaciones");
                    } else {
                        for (CuentaBanco cuenta : banco.getCuentasAsociadas()) {
                            cuenta.ingresarDinero();
                        }
                    }
                    break;
                case 3:
                    System.out.println("--Seleccionado retirar dinero");
                    if (banco.getCuentasAsociadas().isEmpty()) {
                        System.out.println("No hay cuentas disponibles para realizar operaciones");
                    } else {
                        for (CuentaBanco cuenta : banco.getCuentasAsociadas()) {
                            cuenta.retirarDinero();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introduce DNI del titular");
                    String dni = sc.next();
                    banco.verCuentasCliente(dni);
                    break;
                case 5:
                    banco.verCuentasBanco(banco);
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
            }
        } while (!salir);
    }
}