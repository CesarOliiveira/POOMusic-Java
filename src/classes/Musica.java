package classes;

public class Musica {
    //Crio as variaveis/Atributos de musicas
    private String cantor;
    private String nomeMusica;
    private int tempo;


    //Crio meu construtor passando as informações que eu quero para criar uma música.
    public Musica(String cantor, String nomeMusica, int tempo){
        //Seto os valores nas respectivas variaveis ambiente de Musica
        this.cantor = cantor;
        this.nomeMusica = nomeMusica;
        this.tempo = tempo;
    }

    //Faço o encapsulamento dessas váriaveis
    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void quantidade(){

    }

    //Crio uma função/metodo para exibir minhas musicas.
    public void exibir(){
        System.out.println("Música: " + nomeMusica);
        System.out.println("Artista: " + cantor);
        System.out.println("Duração: " + tempo + " segundos");
    }
}
