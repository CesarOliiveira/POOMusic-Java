import classes.Album;
import classes.Musica;
import classes.Playlist;
import classes.Usuario;

public class Main {
    public static void main(String[] args) {
        //Crio/Instancio um objeto e digo qual é meu cantor, o nome da música e quanto tempo dura a musica.
        var musica = new Musica("Beyonce", "Seila", 200);
        var musica2 = new Musica("Beyonce", "teste", 300);
        var musica3 = new Musica("Beyonce", "AHAAHAH", 400);

        //Crio/instancio meu objeto e passo para meu Album o Nome, Qual artista é esse album e o ano de lançamento do album
        var album = new Album("Pop", "Beyonce", 1999);


        var usuario = new Usuario("César Oliveira");

        var playlist = new Playlist("Musicas Boas", usuario.getNome());
        var playlist2 = new Playlist("So saudades", usuario.getNome());

        playlist.add(musica);
        playlist.add(musica2);

        playlist2.add(musica3);

        usuario.addPlaylist(playlist);
        usuario.addPlaylist(playlist2);

        //Adiciono minhas musicas passando a função que criei em Album "addMusic" e adiciono ela na minha listagem
        album.addMusic(musica);
        album.addMusic(musica2);
        album.addMusic(musica3);

        //Chamo a função criada na classe Album "exibirAlbum" para mostrar para o usuario as musicas que tem dentro do album.
        usuario.mostrar();
        //album.exibirAlbum();

        playlist.play(musica);



    }
}