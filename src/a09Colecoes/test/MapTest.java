package a09Colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Teclado", "teclado");
        map.put("Mouse", "mouse");
        map.put("Monitor", "monitor");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        System.out.println("---------------------");

        for (String values : map.values()) {
            System.out.println(values);
        }
    }   
}
