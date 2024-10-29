package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Filme avatar = new Filme("Avatar", 2023);
        avatar.avalia(6);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(avatar);
        lista.add(lost);

        for (Titulo item: lista){       //Para cada variavel "item" do tipo "Titulo em "lista"
            System.out.println(item.getNome());   //<- faz isso
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("\nLista de titulos ordenadas");
        Collections.sort(lista);

        for (Titulo item: lista){
            System.out.println(item);
        }

        System.out.println("\nOrdenando por ano de lançamento: ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        for (Titulo item: lista){
            System.out.println(item);
        }
    }
}
