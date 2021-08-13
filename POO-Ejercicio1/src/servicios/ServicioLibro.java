package servicios;

import com.company.Libro;

import java.util.Scanner;

public class ServicioLibro {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {

        System.out.println("Introducir ISBN");
        String isbn = sc.next();

        System.out.println("Introducir Título");
        String titulo = sc.next();

        System.out.println("Introducir Autor");
        String autor = sc.next();

        System.out.println("Introducir Número de páginas");
        int numeroPaginas = sc.nextInt();

        return new Libro(isbn, titulo, autor, numeroPaginas);

    }

}
