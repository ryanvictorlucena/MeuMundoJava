package a06OrientacaoObjetos.interfacee;

public interface DataLoader {
    void load();

    default void imprime() {
        System.out.println("Dados carregados: ");
    }
}
