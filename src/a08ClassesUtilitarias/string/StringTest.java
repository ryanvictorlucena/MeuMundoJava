package a08ClassesUtilitarias.string;

public class StringTest {
    
    public static void main(String[] args) {
        String nome = "Ryan";
        String nome2 = "Ryan";
        nome = nome.concat(" Victor");
        nome2.concat(" Victor");
        System.out.println(nome); //aqui ouve uma troca de referência, por isso aconteceu a mudança
        System.out.println(nome2); //aqui não teve troca de referência, ainda esta associado ao mesmo objeto
        
    }
}
