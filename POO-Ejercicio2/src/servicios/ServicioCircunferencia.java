package servicios;

import com.company.Circunferencia;

import java.util.Scanner;

public class ServicioCircunferencia {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {

    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.

        System.out.println("Ingrese el radio para obtener la circunferencia:");
        double radio = sc.nextDouble();

        return new Circunferencia(radio);

    }

}
