package com.company;

import java.util.Scanner;

public class ServicioRectangulo {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        System.out.println("Ingrese la base del rectangulo:");
        int base = sc.nextInt();

        System.out.println("Ingrese la altura del rectangulo:");
        int altura = sc.nextInt();

        return new Rectangulo(base, altura);

    }

}
