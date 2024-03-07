package classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Playlist> playlist;

    public Usuario(String nome){
        this.nome = nome;
        this.playlist = new ArrayList<Playlist>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addPlaylist(Playlist play){
        playlist.add(play);
    }

    public void removePlaylist(Playlist play){
        playlist.remove(play);
    }

    public void mostrar(){

        System.out.println("Autor da Playlist: " + this.nome);
        for(Playlist playlists: playlist){
            playlists.mostrarMusicas();
        }

    }
}
