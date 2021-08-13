//• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

package com.company;

import java.util.Scanner;

public class ServicioCuentaBancaria {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        System.out.println("\n[ BIENVENIDO AL BANCO XXX POR FAVOR, INGRESE SUS DATOS: ]\n");

        System.out.println("Ingrese su numero de cuenta:");
        int numeroCuenta = sc.nextInt();

        System.out.println("Ingrese su DNI:");
        int dni = sc.nextInt();

        System.out.println("Ingrese su saldo:");
        int saldoActual = sc.nextInt();

        return new CuentaBancaria(numeroCuenta, dni, saldoActual);

    }

}
