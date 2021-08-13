//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
//otro atributo, puede hacerlo. Los métodos que se implementarán son:
//• Un constructor por defecto.
//• Un constructor con todos los atributos como parámetro.
//• Métodos getters y setters de cada atributo.
//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//(incluidos), significa que el peso está por debajo de su peso ideal y la función
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
//significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
//hacer uso de constantes para devolver estos valores.
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//en distintas variables, para después en el main, calcular un porcentaje de esas 4
//personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//cuantos menores.

package com.company;

public class Main {

    public static void main(String[] args) {

        //Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
        //los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
        //tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
        //persona es mayor de edad.


        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        p1.crearPersona();
        p2.crearPersona();
        p3.crearPersona();
        p4.crearPersona();

        //Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
        //en distintas variables, para después en el main, calcular un porcentaje de esas 4
        //personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
        //encima

        System.out.println("\n[ INDICE DE MASA MUSCULAR ]\n");

        System.out.println("El resultado de la IMC es: " + p1.calcularIMC());
        System.out.println("El resultado de la IMC es: " + p2.calcularIMC());
        System.out.println("El resultado de la IMC es: " + p3.calcularIMC());
        System.out.println("El resultado de la IMC es: " + p4.calcularIMC());

        System.out.println("\n[ MAYORES DE EDAD ]\n");

        System.out.println("El resultado si es mayor de edad es: " + p1.esMayorDeEdad());
        System.out.println("El resultado si es mayor de edad es: " + p2.esMayorDeEdad());
        System.out.println("El resultado si es mayor de edad es: " + p3.esMayorDeEdad());
        System.out.println("El resultado si es mayor de edad es: " + p4.esMayorDeEdad());

        System.out.println("\n[ PORCENTAJE DE MAYORES ]\n");

        int arregloEdades[] = new int[]{p1.getEdad(),p2.getEdad(),p3.getEdad(),p4.getEdad()};

        porcentajeMayores(arregloEdades);

    }

    public static void porcentajeMayores(int edades[]) {

        //también calcularemos un porcentaje de cuantos son mayores de edad y
        //cuantos menores.

        double cantidadMayores = 0;
        double cantidadMenores = 0;

        for (int i = 0; i < edades.length; i++) {

            if (edades[i] < 18) {

                cantidadMenores++;

            } else {

                cantidadMayores++;

            }

        }

        double porcentajeMayores = (cantidadMayores / 4) * 100;
        double porcentajeMenores = (cantidadMenores / 4) * 100;

        System.out.println("El porcentaje de mayores es de: " + porcentajeMayores + "%");
        System.out.println("El porcentaje de menores es de: " + porcentajeMenores + "%");

    }
}
