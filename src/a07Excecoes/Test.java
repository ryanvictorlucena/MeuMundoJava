package a07Excecoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {
    public static void main(String[] args) {
        lerArquivo();
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

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
        reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) 
                    reader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
