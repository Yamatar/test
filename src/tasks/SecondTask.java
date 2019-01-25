package tasks;

import java.math.BigInteger;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = sc.nextInt();
        System.out.print("Input r: ");
        int r = sc.nextInt();
        sc.close();
        if (r > m) {
            System.out.println("Incorrect data");
        } else {
            BigInteger mrF;
            BigInteger rF;
            BigInteger mF;
            if (r > m - r) {
                mrF = factorial(BigInteger.valueOf(1), 1, m - r);
                rF = factorial(mrF, m - r + 1, r);
                mF = factorial(rF, r + 1, m);
            } else {
                rF = factorial(BigInteger.valueOf(1), 1, r);
                mrF = factorial(rF, r + 1, m - r);
                mF = factorial(mrF, m - r + 1, m);
            }
            System.out.println(mF.divide(rF.multiply(mrF)));
        }
    }

    private static BigInteger factorial(BigInteger value, int start, int end) {
        for (int i = start; i <= end; ++i) value = value.multiply(BigInteger.valueOf(i));
        return value;
    }
}
