package test_1;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i <= n-1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i <= n-1; i++) {
            if (a[i] % 45 == 0 || 18 % a[i] == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
