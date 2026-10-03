package a07Excecoes;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        /*int[] numeros = {1, 2, 3};
        System.out.println(numeros[5]);
        o compilador não reclama se eu tentar retornar um indice inexistente, 
        mas esse código quebra em tempo de execução*/
        //System.out.println(div(10, 0));
        Test e = new Test();
        e.abreConexao();
    }

    public static void createNewArch() {
        File file = new File("");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado " + isCreate);
        } catch (IOException e) {
            e.printStackTrace();            
        }
    }

    public static int div(int a, int b) {
        if (b == 0) 
            throw new IllegalArgumentException("Indefinido");
        return a/b;
    }

    public void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
