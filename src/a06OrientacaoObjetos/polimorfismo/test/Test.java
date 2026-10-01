package a06OrientacaoObjetos.polimorfismo.test;

import a06OrientacaoObjetos.polimorfismo.dominio.CalcularImposto;
import a06OrientacaoObjetos.polimorfismo.dominio.Computador;
import a06OrientacaoObjetos.polimorfismo.dominio.Televisao;
import a06OrientacaoObjetos.polimorfismo.dominio.Tomate;

public class Test {
    public static void main(String[] args) {
        Computador pc = new Computador("NUC10i7", 11000);
        Tomate tm = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Sansumg 50\" ", 5000);
        
        CalcularImposto.calcularImopsto(pc);
        System.out.println("---------------------------");
        CalcularImposto.calcularImopsto(tm);
        System.out.println("---------------------------");
        CalcularImposto.calcularImopsto(tv);
    }
}
