import java.util.HashMap;

public class ProductStock {
    public static void main(String[] args) {

        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("Laptop", 5);
        stock.put("Mouse", 20);
        stock.put("Keyboard", 10);
        stock.put("Monitor", 3);

        System.out.println("All products:");
        stock.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("\nLow stock products:");
        stock.forEach((k, v) -> {
            if (v < 6) {
                System.out.println(k + " -> " + v);
            }
        });
    }
}