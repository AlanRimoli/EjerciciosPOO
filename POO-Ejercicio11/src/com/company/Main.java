//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
//la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
//pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
//fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();

package com.company;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        //Scanner

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("[ INGRESE UNA FECHA ]\n");

        //Ingreso de Dia, mes y año.

        System.out.println("DÍA:");
        int dia = sc.nextInt();

        System.out.println("MES:");
        int mes = sc.nextInt();
        //Se resta 1 por que el mes comienza en 0
        mes -= 1;

        System.out.println("AÑO:");
        int anio = sc.nextInt();
        //Se resta 1900 por que inicia en 1900
        anio -= 1900;

        System.out.println("\n[ INGRESE LA HORA ]\n");

        System.out.println("HORA:");
        int hora = sc.nextInt();

        System.out.println("MINUTOS:");
        int minutos = sc.nextInt();
//        minutos += 1;

        System.out.println("SEGUNDOS:");
        int segundos = sc.nextInt();
//        segundos += 1;

        //Objeto

        Date fecha = new Date(anio, mes, dia, hora, minutos, segundos);

        //Nuevo Objeto

        Date fechaActual = new Date();

        //Mostramos por consola los resultados

        System.out.println("\n[ FECHA INGRESADA ]\n");

        System.out.println(fecha);

        System.out.println("\n[ FECHA ACTUAL ]\n");

        System.out.println(fechaActual);

        System.out.println("\n[ RESULTADO ]\n");

        if (fecha.equals(fechaActual)) {

            System.out.println("No hay diferencia de años");

        } else if (fecha.after(fechaActual)) {

            System.out.println("La fecha ingresada es mayor que la fecha actual");

        } else {

            System.out.println("La fecha actual es mayor que la fecha ingresada");

        }

        //Diferencia de años.

        System.out.println("\n [ DIFERENCIA DE AÑOS ]\n");

        long diff = fecha.getTime() - fechaActual.getTime();
        //Lo mayor es dias, por eso TimeUnit.>DAYS<
        TimeUnit time = TimeUnit.DAYS;

        //Diferencia dividido por 365 para hacerlo por año.

        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println("La diferencia de años es de : " + diffrence / 365);


    }
}
