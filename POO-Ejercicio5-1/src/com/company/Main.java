package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner leer = new Scanner(System.in);
            CuentaBancaria cn = new CuentaBancaria();
            int opcion = 0;
            cn.crearCuenta();
            do {
                System.out.println("*** BIENVENIDO AL BANCO EGG ***");
                System.out.println("<> ¿QUE OPERACION DESEA REALIZAR? <>");
                System.out.println("1 - Ingresar dinero.");
                System.out.println("2 - Retirar dinero.");
                System.out.println("3 - Extraccion rapida.");
                System.out.println("4 - Consultar saldo de cuenta.");
                System.out.println("5 - Consultar datos de usuario.");
                System.out.println("6 - Salir");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        cn.ingresarDinero();
                        break;
                    case 2:
                        cn.retirarDinero();
                        break;
                    case 3:
                        cn.extraccRapida();
                        break;
                    case 4:
                        cn.consultaSaldo();
                        break;
                    case 5:
                        cn.datosCliente();
                        break;
                    case 6:
                        System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO!!!");
                    default:
                        System.out.println("La opcion ingresada es incorrecta");
                }
            } while (opcion != 6);
        }

    }
