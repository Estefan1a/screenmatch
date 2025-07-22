public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }


    void muestraFichaTecica(){
        System.out.println("El nombre de la película es:  " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duración es de: " + duracionEnMinutos +  " minutos");
    }

    void evaluacion(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones ++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }

}
