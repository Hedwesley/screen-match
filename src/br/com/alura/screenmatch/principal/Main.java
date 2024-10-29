package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    meuFilme.setDuracaoEmMinutos(180);

    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    System.out.println(meuFilme.getSomaDasAvaliacoes());
    System.out.println(meuFilme.getTotalDeAvaliacoes());
    System.out.println(meuFilme.pegaMedia());

    Serie lost = new Serie("Lost", 2000);
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duração para maratonar serie " + lost.getNome() +": " + lost.getDuracaoEmMinutos());

    Filme avatar = new Filme("Avatar", 2023);
    avatar.exibeFichaTecnica();
    avatar.setDuracaoEmMinutos(200);

    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(meuFilme);
    calculadora.inclui(avatar);
    System.out.println(calculadora.getTempoTotal());

    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtra(meuFilme);

    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setSerie(lost);
    episodio.setTotalVisualizacoes(300);
    filtro.filtra(episodio);

    Filme filmeDoPaulo = new Filme("Dogville", 2003);
    filmeDoPaulo.setDuracaoEmMinutos(200);
    filmeDoPaulo.avalia(10);

    ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    listaDeFilmes.add(filmeDoPaulo);
    listaDeFilmes.add(meuFilme);
    listaDeFilmes.add(avatar);
    System.out.println("Tamanho da lista: " + listaDeFilmes.size());
    System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());

    System.out.println();

    System.out.println(listaDeFilmes);
}
}