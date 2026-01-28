package PatternPrinting;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i <= a-1; i++) {
            for (int j = 0; j <= b-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
