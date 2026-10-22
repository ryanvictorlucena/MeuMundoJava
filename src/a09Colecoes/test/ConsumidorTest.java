package a09Colecoes.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import a09Colecoes.dominio.Consumidor;
import a09Colecoes.dominio.Manga;

public class ConsumidorTest {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Bianca");
        Consumidor c2 = new Consumidor("Luana");

        Manga manga1 = new Manga("Naruto", 5L, 19.9);
        Manga manga2 = new Manga("Dragon Ball", 1L, 20.9);
        Manga manga3 = new Manga("One Piece", 2L,25.9);
        Manga manga4 = new Manga("Tokyo Revenger", 3L, 15.0);
        Manga manga5 = new Manga("Blue Lock", 4L, 10.9);

        List<Manga> mangaConsumidor1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2 = List.of(manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, mangaConsumidor1);
        consumidorManga.put(c2, mangaConsumidor2);
        
        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome());
            System.out.println(entry.getValue());
        }
    }
}
