package com.company;

import java.util.Scanner;

public class ServiciosCafetera {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera(){

        System.out.println("[ BIENVENIDO A LA CAFETERA DE NESPRESO ]");

        System.out.println("Ingrese la cantidad maxima de la cafetera");
        int cantidadMaxima = sc.nextInt();

        System.out.println("Ingrese la cantidad que tiene en la cafetera");
        int cantidadActual = sc.nextInt();

        return new Cafetera(cantidadMaxima, cantidadActual);

    }

}
