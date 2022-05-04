package maratonajavadevdojo.javacore.Csobrecargametodos.test;

import maratonajavadevdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Hajime No Ippo", "TV", 12);
        anime.init("Hajime No Ippo", "TV", 350, "Artes marciais");
        anime.imprime();
    }
}
