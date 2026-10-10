package a09Colecoes.lista;

import java.util.ArrayList;
import java.util.List;

public class ListaTest {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes1.add("João");
        nomes1.add("Maria");
        nomes1.add("Dionisio");
        nomes2.add("Afrodite");
        nomes2.add("Thomas");

        System.out.println(nomes1);
        System.out.println(nomes2);

        nomes1.addAll(nomes2);
        
        System.out.println(nomes1);
        System.out.println(nomes1.remove("Thomas"));
        System.out.println(nomes1);


        List<Integer> numero = new ArrayList<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        numero.add(5);
        System.out.println(numero.size());
    }
}
