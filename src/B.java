import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("YES");
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
