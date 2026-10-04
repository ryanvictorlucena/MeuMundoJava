package a08ClassesUtilitarias.string;

public class StringTest2 {
    
    public static void main(String[] args) {
        String nome = " kakaroto";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.replace("roto", ""));
        System.out.println(numeros.substring(1, 4));
        System.out.println(nome.trim());
    }
}
