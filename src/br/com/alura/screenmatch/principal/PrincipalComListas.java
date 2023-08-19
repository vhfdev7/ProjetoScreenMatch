package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;


import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Avengers Infinit War", 2018);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avengers Endgame", 2019);
        outroFilme.avalia(10);

        var filmeDoVto = new Filme("Iron Man", 2008);
        filmeDoVto.avalia(9);

        Serie naruto = new Serie("Naruto", 2002);

        Filme f1 = filmeDoVto;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoVto);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(naruto);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
            System.out.println("Classificação " + filme.getClassificacao());
        }
    }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("The Rock");
        buscaPorArtista.add("Vin Diesel");
        buscaPorArtista.add("Adam Sandler");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois de organizar");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

}}
