import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] c = s.toCharArray();

        int n = c.length;
        System.out.println(c[n-2]);
    }
}
