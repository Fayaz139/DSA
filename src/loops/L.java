package loops;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = 0;

        while (n > 0) {
            sum += (n % 10);
            n = n / 10;
        }

        System.out.println(sum);
    }
}
