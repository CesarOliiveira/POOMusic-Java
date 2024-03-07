package classes;

import java.util.ArrayList;
import java.util.List;

public class Album {
    //Crio minhas variaveis para uso
    private String nome;
    private String artista;

    private int anoLancamento;
    private List<Musica> musicas;

    //Crio meu construtor passando as informações que eu quero em parenteses, junto com a tipagem de cada uma das informações.
    public Album(String nome, String artista, int anoLancamento){
        //Seto as informações passadas no meu construtor para as váriaveis da classe "Album"
        this.nome = nome;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.musicas = new ArrayList<>();
    }


    //Crio minha função que vai adicionar na listagem do album
    public void addMusic(Musica musica){
        musicas.add(musica);
    }

    //Crio uma função para exibir essa listagem e mostrar para o usuario.
    public void exibirAlbum() {
        System.out.println("Álbum: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento + "\n");
        System.out.println("Lista de Músicas: \n");
        for (Musica musica : musicas) {
            musica.exibir();
            System.out.println();
        }
    }

}
