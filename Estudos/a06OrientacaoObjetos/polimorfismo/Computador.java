package a06OrientacaoObjetos.polimorfismo;

public class Computador extends Produto {
    
    public static final double IMPOSTO_POR_CENTO = 0.21;
    
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.print("Valor do imposto: ");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
