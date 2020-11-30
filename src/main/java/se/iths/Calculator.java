package se.iths;
/*
3. Calculator.java ska kunna addera, subtrahera, multiplicera och dividera
(4 metoder).
*/

public class Calculator {

    public int addInt(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isEqual(int a, int b) {
        return a == b;
    }

    public int product(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return a / b;
    }
}
