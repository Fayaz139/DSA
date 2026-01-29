import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n-1; i++) {
            for (int k = 0; k <= i-1; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n-1; j++) {
                if (j == n - 1) System.out.print(".");
                else System.out.print(". ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int k = n-i-1; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == i) System.out.print(".");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}
