import java.util.*;
//essa classe vai ser deletada


public class ProductMap {

    public static void productMap(String[] args) {
        Map<String, Product> map = new TreeMap<String, Product>();

        Product a = new Product("Calça Masculina Azul", "Calça masculina azul 100% algodão", "Moda Masculina", 49.90, 5);
        map.put("Calça Masculina Azul", a);
        System.out.println(map);

        Collection<Product> products = map.values();
        for (Product b : products) {
            System.out.println(b);
        }
    }
}
