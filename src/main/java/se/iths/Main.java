package se.iths;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 10;
        int b = 7;

        System.out.println("Addition " + calc.addInt(a,b));
        System.out.println("Subtraction " + calc.subtract(a,b));
        System.out.println("Product " + calc.product(a,b));
        System.out.println("Division " + String.format("%.2f", calc.division(a,b)));
        System.out.println("IsEqual " + calc.isEqual(a,b));
    }
}
