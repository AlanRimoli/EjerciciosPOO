package com.company;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {

    }

    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    @Override
    public String toString() {
        return "[ Libro ] \n" +
                "ISBN: " + isbn + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Número de páginas: " + numeroPaginas;
    }

}
