package com.company;

public class Rectangulo {

    private int base;
    private int altura;
    private int i;
    private int j;

    public Rectangulo() {

    }

    public Rectangulo(int base, int altura) {

        this.base = base;
        this.altura = altura;

    }

    public int getBase() {

        return base;

    }

    public void setBase(int base) {

        this.base = base;

    }

    public int getAltura() {

        return altura;

    }

    public void setAltura(int altura) {

        this.altura = altura;

    }

    //Superficie

    public int superficie() {

        return base * altura;

    }

    //Perimetro

    public int perimetro() {

        return (base + altura) * 2;

    }

    public void muestra() {

        System.out.println("\n[ RECTANGULO ]\n");

        while ( i < altura ) {

            while ( j < base ) {

                System.out.print("* ");

                j++;

            }

            System.out.println();

            j = 0;

            i++;

        }

    }

    @Override
    public String toString() {
        return "\n[ RESULTADOS ]\n" +
                "\nSuperficie: " + superficie() + "\n" +
                "Perimetro: " + perimetro();
    }

}
