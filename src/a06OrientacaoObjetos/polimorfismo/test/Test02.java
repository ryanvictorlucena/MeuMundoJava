package a06OrientacaoObjetos.polimorfismo.test;

import a06OrientacaoObjetos.polimorfismo.dominio.Computador;
import a06OrientacaoObjetos.polimorfismo.dominio.Produto;
import a06OrientacaoObjetos.polimorfismo.dominio.Televisao;

public class Test02 {
    public static void main(String[] args) {
       Produto p = new Computador("Ryzen 9", 3000);
       Produto p2 = new Televisao("Samsung", 2500);
       System.out.println(p.getNome());
       System.out.println(p.getValor());
       System.out.println(p2.getNome());
       System.out.println(p2.getValor());
    }
}
