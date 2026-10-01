package a06OrientacaoObjetos.polimorfismo.dominio;

public class CalcularImposto {
    
    /*public static void calcularImopstoComputador(Computador pc) {
        System.out.println("Relatorio imposto do computador");
        double imposto = pc.calcularImposto();
        System.out.println("Computador " + pc.getNome());
        System.out.println("Valor " + pc.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        
    }

    public static void calcularImopstoTomate(Tomate tm) {
        System.out.println("Relatorio imposto do tomate");
        double tomate = tm.calcularImposto();
        System.out.println("Tomate " + tm.getNome());
        System.out.println("Valor " + tm.getValor());
        System.out.println("Imposto a ser pago " + tomate);
        
    }*/

    //método mais generico
    public static void calcularImopsto(Produto p) {
        System.out.println("Relatório de imposto");
        double imposto = p.calcularImposto();
        System.out.println("Produto " + p.getNome());
        System.out.println("Valor " + p.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
