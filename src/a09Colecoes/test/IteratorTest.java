package a09Colecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import a09Colecoes.dominio.Manga;

public class IteratorTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga("Naruto", 5L, 19.9, 0));
        mangas.add(new Manga("Dragon Ball", 1L, 20.9, 5));
        mangas.add(new Manga("One Piece", 2L,25.9, 0));
        mangas.add(new Manga("Tokyo Revenger", 3L, 15.0, 2));
        mangas.add(new Manga("Blue Lock", 4L, 10.9, 0));
        
        System.out.println(mangas);
        
        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
    }
}
