package com.company;

public class Matematica {

    //atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas

    private double numero1;
    private double numero2;

    public Matematica() {

    }

    public Matematica(double numero1, double numero2) {

        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    //La clase deber tener un constructor vacío, parametrizado y get y set

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     * Metodos
     */

    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
    //valor

    public void devolverMayor() {

        System.out.println("El numero mayor es: " + Math.max(this.numero1, this.numero2));

    }

    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.

    public void calcularPotencia() {

        //Numero 1 redondeado

        double numero1Re = Math.round(
                (this.numero1 * 100.0) / 100.0);
        double numero2Re = Math.round(
                (this.numero2 * 100.0) / 100.0);

        System.out.println("El numero mayor elevado es " + Math.pow(Math.max(numero1Re, numero2Re), Math.min(numero1Re, numero2Re)));

    }

    //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número

    public void calcularRaiz() {

        System.out.println("El numero elevado menor es: " + Math.sqrt(Math.min(this.numero1, this.numero2)));

    }

}

