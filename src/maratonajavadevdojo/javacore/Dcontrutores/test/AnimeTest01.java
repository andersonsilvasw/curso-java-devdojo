package maratonajavadevdojo.javacore.Dcontrutores.test;

import maratonajavadevdojo.javacore.Dcontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Hajime no Ippo", "TV", 350, "Artes marciais");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
