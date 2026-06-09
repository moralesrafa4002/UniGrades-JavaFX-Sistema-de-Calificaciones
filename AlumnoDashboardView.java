package com.rafa.unigrades.model;

public class Alumno {
    private int idUsuario;
    private String matricula;
    private int idCarrera;

    public Alumno() {}

    public Alumno(int idUsuario, String matricula, int idCarrera) {
        this.idUsuario = idUsuario;
        this.matricula = matricula;
        this.idCarrera = idCarrera;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public int getIdCarrera() { return idCarrera; }
    public void setIdCarrera(int idCarrera) { this.idCarrera = idCarrera; }
}
