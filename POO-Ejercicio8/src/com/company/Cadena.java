package com.company;

import java.util.Scanner;

public class Cadena {

    //atributos una frase (de tipo de String) y su longitud

    private String cadena;
    private int longCadena;

    //Constructor vacio

    public Cadena() {

    }

    //Constructor con atributos

    public Cadena(String cadena, int longCadena) {

        this.cadena = cadena;
        this.longCadena = longCadena;

    }

    //Getter & Setter

    public String getCadena() {

        return cadena;

    }

    public void setCadena(String Cadena) {

        this.cadena = cadena;

    }

    public int getLongCadena() {

        return longCadena;

    }

    public void setLongCadena(int longCadena) {

        this.longCadena = longCadena;

    }

    /**
     * Metodos
     */

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    //frase ingresada.

    public void mostrarVocales() {

        int contador = 0;

        for (int i = 0; i < this.longCadena; i++) {

            if (this.cadena.charAt(i) == 'a' || this.cadena.charAt(i) == 'e' || this.cadena.charAt(i) == 'i' || this.cadena.charAt(i) == 'o' || this.cadena.charAt(i) == 'u') {

                contador++;

            }

        }

        System.out.println("La frase tiene un total de: " + contador + " vocales");

    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
    //por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase() {

        StringBuilder strb = new StringBuilder(this.cadena);
        System.out.println("La cadena invertida es: " + strb.reverse().toString());

    }

    //Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
    //ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
    //frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido(char letra) {

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (this.cadena.charAt(i) == letra) {

                contador++;

            }

        }

        System.out.println("El carácter: " + letra + " se repite: " + contador + " veces.");

    }

    //Método compararLongitud(String frase), deberá comparar la longitud de la frase
    //que compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(String frase) {

        if (this.longCadena == frase.length()) {

            System.out.println("La longitud es igual");

        } else if (this.longCadena > frase.length()) {

            System.out.println("La longitud de " + this.cadena + " es mayor a " + frase);

        } else {

            System.out.println("La longitud de " + this.cadena + " es menor a " + frase);

        }
    }

    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.

    public void unirFrases(String frase) {

        System.out.println(this.cadena + " " + frase);

    }

    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    //mostrar la frase resultante.

    public void reemplazar(char letra) {

        String nuevaCadena = this.cadena.replace('a', letra);

        System.out.println(nuevaCadena);

    }

    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.

    public boolean contiene(String letra) {

        if (this.cadena.contains(letra)) {

            return true;

        } else {

            return false;

        }

//        Otra opcion
//        return this.cadena.contains(letra);

    }

    public void menuCadena() {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int menu = 0;

        do {

            System.out.println("\n[ MENU ] \n" +
                    "1. Mostrar Vocales \n" +
                    "2. Invertir Frase \n" +
                    "3. Veces Repetido \n" +
                    "4. Comparar Longitud \n" +
                    "5. Unir Frases \n" +
                    "6. Reemplazar \n" +
                    "7. Validar letra \n"+
                    "8. Salir \n");

            menu = sc.nextInt();

            switch (menu) {

                case 1:

                    this.mostrarVocales();
                    break;

                case 2:

                    this.invertirFrase();
                    break;

                case 3:

                    System.out.println("Ingrese la letra a buscar:");
                    char letra = sc.next().charAt(0);

                    this.vecesRepetido(letra);
                    break;

                case 4:

                    System.out.println("Ingrese una frase para la comparacion de longitud");
                    String frase = sc.next();

                    this.compararLongitud(frase);
                    break;

                case 5:

                    System.out.println("Ingrese la frase a unir");
                    String unirFrase = sc.next();
                    this.unirFrases(unirFrase);
                    break;

                case 6:


                    System.out.println("Ingrese la letra a reemplazar por la letra 'a' ");
                    char letraReemplazo = sc.next().charAt(0);

                    this.reemplazar(letraReemplazo);
                    break;

                case 7:

                    System.out.println("Ingrese la letra a verificar");
                    String letraCom = sc.next();

                    this.contiene(letraCom);
                    break;

                case 8:

                    System.out.println("SALIENDO");
                    break;

                default:

                    System.out.println("La opcion ingresada es incorrecta");

            }

        } while (menu != 8);

    }

}
