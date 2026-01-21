package Basics;

import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a;
        int max = a;

        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
        }

        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
