//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
//otro atributo, puede hacerlo. Los métodos que se implementarán son:

package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;

    //Constructor por defecto

    public Persona() {

    }

    //Constructor con todos los atributos como parámetro.

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    //Getter & Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Metodos
     */

    //• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    //al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    //Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    //O. Si no es correcto se deberá mostrar un mensaje

    public void crearPersona() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ Ingrese los datos necesarios ]\n");

        System.out.println("Nombre: ");
        this.nombre = sc.nextLine();

        System.out.println("Edad: ");
        this.edad = sc.nextInt();

        System.out.println("Sexo: ");
        this.sexo = sc.next();

        this.sexo = this.sexo.toLowerCase();

        while (!this.sexo.equals("h") && !this.sexo.equals("m") && !this.sexo.equals("o")) {

            System.out.println("Ingrese una opcion valida [ H , M , O ]");

            this.sexo = sc.next();

            this.sexo = this.sexo.toLowerCase();

        }

        System.out.println("Peso: ");
        this.peso = sc.nextInt();

        System.out.println("Altura: ");
        this.altura = sc.nextDouble();

    }

    //Método calcularIMC() [ funcion ]: calculara si la persona está en su peso ideal (peso en
    //kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
    //función devuelve un -1 (peso ideal). Si la fórmula da por resultado un número
    //(incluidos), significa que el peso está por debajo de su peso ideal y la función
    //devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
    //significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
    //hacer uso de constantes para devolver estos valores.

    //Si devuelve algo es funcion y va con return

    //El peso ideal se calcula dividiendo el peso en kilogramos por el cuadrado de la altura en metros (kg/m2).
    //Ejemplo: Si una persona pesa 60 kilos y mide 1,50 el resultado final sería 26, 6

    public int calcularIMC() {

        if (this.peso / this.altura * this.altura > 20) {

            return -1;

        } else if (this.peso / this.altura * this.altura >= 20 && this.peso / this.altura * this.altura <= 25) {

            return 0;

        } else {

            return 1;

        }


    }

    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    //devuelve un booleano.

    public boolean esMayorDeEdad() {

        if (this.edad < 18) {

            return false;

        } else {

            return true;

        }

    }

}



