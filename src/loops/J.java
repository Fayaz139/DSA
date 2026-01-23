package loops;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        long power = 1;

        for (int i = 0; i <= p-1; i++) {
            power *= n;
        }

        System.out.println(power);
    }
}
