package a09Colecoes.test;

import a09Colecoes.dominio.Smartphone;
import java.util.*;

public class SmartphoneTest {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Motorola");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        
        // se usar somente o método equals sem sobrescrita, a saída será false, mesmo sendo objetos iguais.
        /*System.out.println(s1.equals(s2));
        System.err.println(s1.hashCode());
        System.out.println(s2.hashCode());*/

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone sm : smartphones) {
            System.out.println(sm);
        }

        Smartphone s4 = new Smartphone("22222", "Motorola");
        System.out.println(smartphones.contains(s4));
        System.out.println(smartphones.indexOf(s4));
    }
}
