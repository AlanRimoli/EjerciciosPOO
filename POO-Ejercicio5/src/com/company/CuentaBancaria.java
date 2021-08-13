package com.company;

import java.util.Scanner;

public class CuentaBancaria {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    //Constructor por defecto.

    public CuentaBancaria() {

    }

    //Constructor con DNI, saldo, número de cuenta e interés.

    public CuentaBancaria(int numeroCuenta, long dni, double saldoActual) {

        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;

    }

    //Agregar los métodos getters y setters correspondientes

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }


    /**
     * Metodos
     */


    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    //ingresar y se la sumara a saldo actual.

    public void ingresarDinero() {

        Scanner ing = new Scanner(System.in);

        int ingreso;

        System.out.println("¿Que monto desea Ingresar?");
        ingreso = ing.nextInt();

        saldoActual += ingreso;

        System.out.println("Ahora tiene un monto de: $" + saldoActual + "\n");

        this.menuBanco();

    }


    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    //se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.

    public void retirarDinero() {

        double retiro;

        Scanner ret = new Scanner(System.in);

        System.out.println("¿Que monto desea retirar?");

        retiro = ret.nextDouble();

        if (saldoActual > retiro) {

            saldoActual -= retiro;

            System.out.println("Ah retirado: $" + retiro + " su saldo actual es de " + saldoActual + "\n");

        } else {

            if (saldoActual < retiro) {

                System.out.println("Su saldo es menor al indicado para retirar\n");

            }
        }

        this.menuBanco();
    }

    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
    //que el usuario no saque más del 20%

    public void extraccionRapida() {

        Scanner rap = new Scanner(System.in);

        double retiro;

        System.out.println("¿Que monto desea extraer? (Solamente el 20% del total)");

        retiro = rap.nextDouble();

        while (retiro > this.saldoActual * 0.20){

            System.out.println("El retiro no puede ser mayor al 20% de su saldo.\n");
            System.out.println("[ Ingrese nuevamente el importe ]\n");

            retiro = rap.nextDouble();

        }

        this.saldoActual -= retiro;

        System.out.println("Extrajo: $" + retiro + " su saldo actual es de " + saldoActual + "\n");

        this.menuBanco();
    }

    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.

    public void consultarSaldo() {

        System.out.println("Su saldo actual es de: " + saldoActual);

        this.menuBanco();

    }

    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

    public void consultarDatos() {

        System.out.println("[ DATOS DE LA CUENTA ]\n" +
                "Nº de Cuenta: " + numeroCuenta + "\n" +
                "DNI: " + dni + "\n" +
                "Saldo Actual: " + saldoActual + "\n");

        this.menuBanco();

    }

    //Menu para el ingreso de datos.

    public void menuBanco() {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int menu = 0;

        do {

            System.out.println("\n¿Que desea hacer? \n" +
                    "1. Ingresar dinero \n" +
                    "2. Retirar dinero \n" +
                    "3. Extraccion Rapida \n" +
                    "4. Consultar saldo \n" +
                    "5. Consultar datos \n" +
                    "6. Salir \n");

            menu = sc.nextInt();

            switch (menu) {

                case 1:

                    this.ingresarDinero();
                    break;

                case 2:

                    this.retirarDinero();
                    break;

                case 3:

                    this.extraccionRapida();
                    break;

                case 4:

                    this.consultarSaldo();
                    break;

                case 5:

                    this.consultarDatos();
                    break;

                case 6:

                    System.out.println("Gracias por usar el BANCO XXX");
                    break;

                default:

                    System.out.println("La opcion ingresada es incorrecta");

            }

        } while (menu != 6);

    }

}

