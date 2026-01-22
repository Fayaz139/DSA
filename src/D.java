import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        for (int i = s; i <= e; i++) {
            System.out.print(i + " ");
        }
    }
}
