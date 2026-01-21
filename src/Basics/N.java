package Basics;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("Min = " + a);
            System.out.println("Max = " + b);
        }
        else {
            System.out.println("Min = " + b);
            System.out.println("Max = " + a);
        }
    }
}
