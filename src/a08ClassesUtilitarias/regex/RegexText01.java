package a08ClassesUtilitarias.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText01 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+";
        //String texto = "abaaba";
        //String texto2 = "abababa";
        String texto3 = "luffy@hotmail.com, 123kuririn@gmail.com, teste@gmail.com, naruto@gmail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto3);
        System.out.println("Texto: " + texto3);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
