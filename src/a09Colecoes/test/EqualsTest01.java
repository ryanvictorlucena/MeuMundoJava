package a09Colecoes.test;

import a09Colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("1ABC1", "iphone");
        // se usar somente o método equals sem sobrescrita, a saída será false, mesmo sendo objetos iguais.
        System.out.println(s1.equals(s2));
        System.err.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
