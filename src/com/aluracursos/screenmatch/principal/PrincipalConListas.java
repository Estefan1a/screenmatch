package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evaluacion(8);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evaluacion(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2021);
        peliculaDeBruno.evaluacion(9);
        Serie casaDragon = new Serie("La casa del dragón", 2022);


        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listasDeArtistas= new ArrayList<>();
        listasDeArtistas.add("Penélope Cruz");
        listasDeArtistas.add("Antonio Bnderas");
        listasDeArtistas.add("Ricardo Darín");

        System.out.println(listasDeArtistas);

        Collections.sort(listasDeArtistas);
        System.out.println("Lista de artistas Ordenada" + listasDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos Ordenados" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada pro fecha: " + lista);











    }
}
