//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
//un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set. Deberá además implementar los siguientes métodos:
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//20
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número

package com.company;

public class Main {

    public static void main(String[] args) {

        //En el main se creará el objeto y se usará el Math.random para generar los dos números
        //y se guardaran en el objeto con su respectivos set

        Matematica n1 = new Matematica(Math.random() * 100, Math.random() * 100);

        System.out.println("\n[ NUMEROS ]\n");

        System.out.println("El numero 1 es: " + n1.getNumero1());
        System.out.println("El numero 2 es: " + n1.getNumero2());

        System.out.println("\n[ RESULTADOS ]\n");

        n1.devolverMayor();
        n1.calcularPotencia();
        n1.calcularRaiz();

    }
}
