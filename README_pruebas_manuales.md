package com.rafa.unigrades.model;

public class Administrador {
    private int idUsuario;
    private String numeroEmpleado;

    public Administrador() {}

    public Administrador(int idUsuario, String numeroEmpleado) {
        this.idUsuario = idUsuario;
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public String getNumeroEmpleado() { return numeroEmpleado; }
    public void setNumeroEmpleado(String numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }
}
