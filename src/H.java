import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i <= l-1; i++) {
            for (int j = 0; j <= b-1; j++) {
                if (i == 0 || i == l-1 || j == 0 || j ==b-1) {
                    System.out.print("^");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
