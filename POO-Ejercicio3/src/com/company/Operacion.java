package com.company;

public class Operacion {

    private int numero1;
    private int numero2;

    //Metodo constructor sin los atributos pasados por parámetro.

    public Operacion() {

    }

    //Método constructor con todos los atributos pasados por parámetro.

    public Operacion(int numero1, int numero2) {

        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    //Agregamos Get y Set de numero 1

    public int getNumero1() {

        return numero1;

    }

    public void setNumero1(int numero1) {

        this.numero1 = numero1;

    }

    //Agregamos Get y Set de numero 2

    public int getNumero2() {

        return numero2;

    }

    public void setNumero2(int numero2) {

        this.numero2 = numero2;

    }

    //Sumamos los numeros

    public int suma() {

        return numero1 + numero2;

    }

    //Restamos los numeros

    public int resta() {

        return numero1 - numero2;

    }

    //Multiplicamos los numeros

    public int multiplicar() {

        //Si numero 1 o numero 2 es igual a 0, mostramos un cartel de error

        if (numero1 == 0 || numero2 == 0) {

            System.out.println("ERROR, La multiplicación por 0 es 0.");
            return 0;

        } else {

            return numero1 * numero2;

        }

    }

    //Dividimos los numeros

    public int dividir() {

        //Si numero 1 o numero 2 es igual a 0, mostramos un cartel de error

        if (numero1 == 0 || numero2 == 0) {

            System.out.println("ERROR, No se puede dividir por 0");
            return 0;

        } else {

            return numero1 / numero2;

        }

    }

    //Mostramos el texto en consola

    @Override
    public String toString() {
        return "[ RESULTADOS ]\n" +
                "Suma: " + suma() + "\n" +
                "Resta: " + resta() + "\n" +
                "Multiplicación: " + multiplicar() + "\n" +
                "División: " + dividir();
    }

}
