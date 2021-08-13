package com.company;

public class Circunferencia {

    private double radio;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {

        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double perimetro(){

        return 2 * 3.14 * radio;

    }

    public double area(){

        return 3.14 * radio * radio;

    }

    @Override
    public String toString() {
        return "[ Circunferencia ]\n" +
                "Radio: " + radio + "\n" +
                "Area: " + area() + "\n" +
                "Perimetro: " + perimetro();

    }

}
