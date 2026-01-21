package Basics;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b % a == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
