package com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Collection;

public class Titulo implements Comparable <Titulo> {
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    //@SerializedName("")
    private int duracionEnMinutos;
    //@SerializedName("")
    private boolean incluidoEnElPlan;
    //@SerializedName("")
    private double sumaDeLasEvaluaciones;
    //@SerializedName("")
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecica(){
        System.out.println("El nombre de la película es:  " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duración es de: " + getDuracionEnMinutos() +  " minutos");
    }

    public void evaluacion(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones ++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento;
    }
}
