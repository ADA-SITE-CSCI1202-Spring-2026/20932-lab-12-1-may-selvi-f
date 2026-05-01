@FunctionalInterface
interface DiscountCalculator {
    double calculate(double price);
}

public class DiscountDemo {
    public static void main(String[] args) {

        DiscountCalculator discount10 = price -> price * 0.9;
        DiscountCalculator discount25 = price -> price * 0.75;

        double price = 100;

        System.out.println("After 10% discount: " + discount10.calculate(price));
        System.out.println("After 25% discount: " + discount25.calculate(price));
    }
}