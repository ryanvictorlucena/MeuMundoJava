package a06OrientacaoObjetos.interfacee;

public class FIleLoader implements DataLoader{
    
    @Override 
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }

    @Override 
    public void imprime() {
        System.out.println("Dados de FileLoader: ");
    }
}
