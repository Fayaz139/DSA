import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= 2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
