package a09Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import a09Colecoes.dominio.Manga;

class MangaByIdComparator implements Comparator<Manga> {

    @Override 
    public int compare(Manga manga1, Manga manga2) {
        return Long.compare(manga1.getId(), manga2.getId());
    }
}
public class MangaTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga("Naruto", 5L, 19.9));
        mangas.add(new Manga("Dragon Ball", 1L, 20.9));
        mangas.add(new Manga("One Piece", 2L,25.9));
        mangas.add(new Manga("Tokyo Revenger", 3L, 15.0));
        mangas.add(new Manga("Blue Lock", 4L, 10.9));
        
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        
        System.out.println("---------------------------------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------------------------");

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
