package test_1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n-1; i++) {
            System.out.println("Hello Codeforces " + (i+1));
        }
    }
}
