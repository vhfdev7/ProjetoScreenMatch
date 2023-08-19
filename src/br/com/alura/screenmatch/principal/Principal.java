import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Avengers Infinit War", 2018);
        meuFilme.setAnoDeLancamento(2018);
        meuFilme.setDuracaoEmMinutos(150);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie naruto = new Serie("Naruto", 2002);
        naruto.exibeFichaTecnica();
        naruto.setTemporadas(9);
        naruto.setEspisodiosPorTemporada(25);
        naruto.setMinutosPorEspisodio(25);
        System.out.println("Duração para maratonar Naruto: " + naruto.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avengers Endgame", 2019);
        outroFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(naruto);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(naruto);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoVto = new Filme("Iron Man", 2008);
        filmeDoVto.setDuracaoEmMinutos(126);
        filmeDoVto.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoVto);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " +  listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " +  listaDeFilmes.get(0).toString());



    }
}
