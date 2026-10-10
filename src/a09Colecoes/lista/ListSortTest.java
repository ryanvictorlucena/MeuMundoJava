package a09Colecoes.lista;

import java.util.*;

public class ListSortTest {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>();
        animes.add("Naruto");
        animes.add("Dragon Ball");
        animes.add("One Piece");
        animes.add("Tokyo Revenger");
        animes.add("Blue Lock");
        
        Collections.sort(animes);

        for (String anime : animes) {
            System.out.println(anime);
        }

        List<Integer> idades = new ArrayList<>();
        idades.add(21);
        idades.add(19);
        idades.add(41);
        idades.add(25);

        Collections.sort(idades);

        for (Integer idade : idades) {
            System.out.print(idade + " ");
        }
    }    
}
