import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String ss = "";
        boolean checker = true;

        for (int i = s.length()-1; i >= 0; i--) {
            ss += s.charAt(i);
        }

        for (int i = 0; i <= s.length()-1; i++) {
            if (s.charAt(i) != ss.charAt(i)) {
                checker = false;
                break;
            }
        }

        if (checker)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
