package com.company;

import java.util.Scanner;

public class CuentaBancaria {

    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su N° de cuenta.");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI sin puntos ni espacios.");
        dniCliente = leer.nextLong();
        System.out.println("Cual es su saldo actual");
        saldoActual = leer.nextInt();
        Cuenta cn = new Cuenta(numeroCuenta, dniCliente, saldoActual);
        return cn;
    }

    public double ingresarDinero() {
        Scanner ing = new Scanner(System.in);
        int ingreso;
        System.out.println("Su saldo actual es: " + saldoActual);
        System.out.println("Cual es el monto que va a ingresar?");
        ingreso = ing.nextInt();
        saldoActual = (saldoActual + ingreso);
        System.out.println("Se actualizo su saldo actual.");
        System.out.println("Ahora tiene un monto de: " + "$" + saldoActual);
        return saldoActual;
    }

    public double retirarDinero() {
        double retiro;
        Scanner ret = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar?");
        retiro = ret.nextDouble();

        if (saldoActual > retiro) {
            saldoActual = saldoActual - retiro;
            System.out.println("Ah retirado " + "$" + retiro + " su saldo actual es de " + saldoActual);
        } else {
            if (saldoActual < retiro) {
                System.out.println("Su saldo es menor al indicado para retirar.");
            }
        }
        return saldoActual;
    }

    public double extraccRapida() {
        Scanner rap = new Scanner(System.in);
        double extrRapida = (20 * saldoActual) / 100;
        double retiro;
        System.out.println("Ingrese el monto que desea retirar ");
        retiro = rap.nextDouble();
        do {
            saldoActual = saldoActual - retiro;
        } while (extrRapida < saldoActual);
        return saldoActual;
    }

    public double consultaSaldo() {
        System.out.println("Su saldo actual es de: " + "$" + saldoActual);
        return saldoActual;
    }

    public void datosCliente() {
        System.out.println("Su N° de cuenta es: " + numeroCuenta);
        System.out.println("Su DNI es: " + dniCliente);
        System.out.println("Su saldo actual es: "+ getSaldoActual());
    }

}
