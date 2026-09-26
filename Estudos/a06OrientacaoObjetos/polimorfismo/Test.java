package a06OrientacaoObjetos.polimorfismo;

public class Test {
    public static void main(String[] args) {
        Computador pc = new Computador("NUC10i7", 11000);
        Tomate tm = new Tomate("Tomate cereja", 10);
        CalcularImposto.calcularImopstoComputador(pc);
        System.out.println("---------------------------");
        CalcularImposto.calcularImopstoTomate(tm);
    }
}
