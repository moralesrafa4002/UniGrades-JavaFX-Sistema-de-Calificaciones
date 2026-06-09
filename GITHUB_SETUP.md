package com.rafa.unigrades.model;

public class Carrera {
    private int id;
    private String nombre;
    private int idUniversidad;

    public Carrera() {}

    public Carrera(int id, String nombre, int idUniversidad) {
        this.id = id;
        this.nombre = nombre;
        this.idUniversidad = idUniversidad;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getIdUniversidad() { return idUniversidad; }
    public void setIdUniversidad(int idUniversidad) { this.idUniversidad = idUniversidad; }

    @Override
    public String toString() { return nombre; }
}
