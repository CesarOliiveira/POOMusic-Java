package classes;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private String autorPlaylist;
    private List<Musica> musicas;

    public Playlist (String nome, String autorPlaylist){
        this.nome = nome;
        this.autorPlaylist = autorPlaylist;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutorPlaylist() {
        return autorPlaylist;
    }

    public void setAutorPlaylist(String autorPlaylist) {
        this.autorPlaylist = autorPlaylist;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public void add(Musica musica){
        musicas.add(musica);
    }

    public void remove(Musica musica){
        musicas.remove(musica);
    }

    public int quantidade(){
        int quantMusicas = 0;
        for(Musica musica : musicas){
            quantMusicas += 1;
        }
        return quantMusicas;
    }

    public void mostrarMusicas(){
        int tempoTotal = 0;

        System.out.println("Nome da Playlist: " + nome);
        System.out.println("----Lista de Músicas----- ");
        for(Musica musica : musicas) {
            tempoTotal += musica.getTempo();
            System.out.println("Artista: " + musica.getCantor() + "\nNome da música: " + musica.getNomeMusica() + "\nTempo: " + musica.getTempo() + "\n");
        }
        System.out.print("Tempo total da Playlist: " + tempoTotal);
        System.out.println("\n");
    }

    public void play(Musica musica){
        System.out.print("Tocando " + musica.getNomeMusica() + ", " + musica.getTempo() + " minutos.");
    }

}
