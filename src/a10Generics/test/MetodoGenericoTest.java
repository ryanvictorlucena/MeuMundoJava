package a10Generics.test;

import java.util.List;

import a10Generics.dominio.Barco;

public class MetodoGenericoTest {
    public static void main(String[] args) {
        List<Barco> barcoTest = criarArrayComUmObjeto(new Barco("Lancha"));
        System.out.println(barcoTest);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);   
    }
}
