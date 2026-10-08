package a08ClassesUtilitarias.regex.scanner;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "goku, naruto, luffy";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                System.out.println("int " + i);
            } else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println(sc.nextBoolean());
            } else {
                System.out.println(sc.next().trim());
            }
        }
        /*String[] nomes = texto.split(",");
        for (String n : nomes) {
            System.out.println(n.trim());
        }*/
    }
}
