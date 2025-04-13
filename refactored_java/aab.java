package aaa;

public class aab {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int findFirstSquareRoot(int a) {
        int b = 0;
        while (multiply(b, b) < a) {
            b++;
        }
        return b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
