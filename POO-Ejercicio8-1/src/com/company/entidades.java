package com.company;

public class entidades {

    private String frase;
    private int longFrase;

    public Cadena(String frase) {
        this.frase = frase;
    }


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return frase.length();
    }

    @Override
    public String toString() {
        return frase;
    }


}
