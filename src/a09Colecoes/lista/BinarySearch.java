package a09Colecoes.lista;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(3);
        numeros.add(0);
        numeros.add(2);

        Collections.sort(numeros);
        System.out.println(numeros);
        //A lista deve está ordenada para utilizar o binarySearch.
        //retorna o índice de onde o elemento passado como parâmetro está.
        //se o elemento não está na lista é retornado um número negativo que indica onde ele deveria estar.
        System.out.println(Collections.binarySearch(numeros, 2));
        System.out.println(Collections.binarySearch(numeros, 1));
    }
}
