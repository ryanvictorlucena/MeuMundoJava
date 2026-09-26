package a06OrientacaoObjetos.polimorfismo.test;

import a06OrientacaoObjetos.polimorfismo.dominio.Computador;
import a06OrientacaoObjetos.polimorfismo.dominio.Produto;

public class Test02 {
    public static void main(String[] args) {
       Produto p = new Computador("Ryzen 9", 3000);
       System.out.println(p.getNome());
       System.out.println(p.getValor());
    }
}
