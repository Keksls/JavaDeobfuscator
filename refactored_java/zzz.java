package aaa;

import aaa.MathUtilities;
import aaa.SquareCalculator;

public class MathUtility {

    public static void main(String[] args) {
        MathUtilities b = new MathUtilities();
        b.sum(10, 5);
        System.out.println("r: " + b.findFirstSquareRoot(10));
        int cbbd = b.multiply(4, 2);
        System.out.println("s: " + cbbd);
        System.out.println("t: " + new MathUtilities().multiply(8, 6));
    }
}
