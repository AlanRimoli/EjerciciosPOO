package com.company;

import java.util.Scanner;

public class ServiciosOperaciones {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion(){

        //Ingreso de datos

        System.out.println("Ingrese el numero 1:");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el numero2:");
        int numero2 = sc.nextInt();

        //Retornamos numero 1 y numero 2

        return new Operacion(numero1, numero2);

    }

}
