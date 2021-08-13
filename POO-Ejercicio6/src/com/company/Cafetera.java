//metodo = void
//funcion = tipo (this.)
//Scanner es una clase.
//sc = objeto que representa la clase, instancia

package com.company;

import java.util.Scanner;

public class Cafetera {

    //capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
    //cantidadActual (la cantidad actual de café que hay en la cafetera)

    private int capacidadMaxima;
    private int cantidadActual;

    //Constructor por defecto

    public Cafetera() {

    }

    //Constructor

    public Cafetera(int capacidadMaxima, int cantidadActual) {

        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;

    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {

        return capacidadMaxima;

    }

    /**
     * Metodos
     */

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {

        if (this.cantidadActual == this.capacidadMaxima) {

            System.out.println("La cafetera ya esta llena");

        } else {

            this.cantidadActual = this.capacidadMaxima;
            System.out.println("La cafetera se lleno con éxito.");

        }

        System.out.println("La cantidad actual es de: " + cantidadActual);

    }

    //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza.

    public void servirTaza(int cantidad) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es el tamaño de la taza vacia?");
        int tamanioTaza = sc.nextInt();

        if (this.cantidadActual < cantidad) {

            System.out.println("La taza se lleno con la cantidad: " + this.cantidadActual + " de: " + tamanioTaza);

            this.cantidadActual = 0;

        } else {

            System.out.println("La taza se lleno");
            this.cantidadActual -= cantidad;

        }

        System.out.println("La cantidad actual es de: " + cantidadActual);

    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero.

    public void vaciarCafetera() {

        System.out.println("La cafetera se vacío con exito.");
        this.cantidadActual = 0;

        System.out.println("La cantidad actual es de: " + cantidadActual);

    }

    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.

    public void agregarCafe(int rellenar) {

        //capacidadMaxima = 1000 < a rellenar (ej 400) + capacidad actual 600 si - 700 NO

        if (this.capacidadMaxima >= rellenar + this.cantidadActual) {

            this.cantidadActual = rellenar;

        } else {

            System.out.println("Ingresaste más que la capacidad maxima, ingrese nuevamente.");

        }

        System.out.println("La cantidad actual es de: " + cantidadActual);

    }

    public void menuCafetera() {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int menu = 0;

        do {

            System.out.println("\n[ MENU ] \n" +
                    "1. Llenar Cafetera \n" +
                    "2. Servir Taza \n" +
                    "3. Vaciar Cafetera \n" +
                    "4. Agregar Café \n" +
                    "5. Salir \n");

            menu = sc.nextInt();

            switch (menu) {

                case 1:

                    this.llenarCafetera();
                    break;

                case 2:

                    System.out.println("¿Cuanto desea ingresar en su taza?");
                    int cantidad = sc.nextInt();
                    this.servirTaza(cantidad);
                    break;

                case 3:

                    this.vaciarCafetera();
                    break;

                case 4:

                    System.out.println("¿Cuanto desea agregar de café?");
                    int rellenar = sc.nextInt();
                    this.agregarCafe(rellenar);
                    break;

                case 5:

                    System.out.println("[ GRACIAS POR USAR LA CAFETERA ]");
                    break;

                default:

                    System.out.println("La opcion ingresada es incorrecta");

            }

        } while (menu != 5);

    }

}
