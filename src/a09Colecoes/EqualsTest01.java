package a09Colecoes;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome1 = "Ryan Victor";
        String nome2 = new String("Ryan Victor");
        System.out.println(nome1 == nome2); //mesmo os nomes sendo iguais vai retornar false
        System.out.println(nome1.equals(nome2)); //faz uma comparação correta e retorna true
    }
}
