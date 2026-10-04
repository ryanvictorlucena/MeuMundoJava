package a08ClassesUtilitarias.string;

public class StringPerformace {
    
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto " + (fim - inicio) + "ms");
    }

    public static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
