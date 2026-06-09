package com.rafa.unigrades.model;

public class Semestre {
    private int id;
    private int numero;

    public Semestre() {}

    public Semestre(int id, int numero) {
        this.id = id;
        this.numero = numero;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    @Override
    public String toString() { return numero + "° semestre"; }
}
