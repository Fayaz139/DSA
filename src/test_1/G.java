package test_1;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] ch = s.toCharArray();
        int count = 0;

        for (int i = 0; i <= ch.length-1; i++) {
            if (ch[i] == '0') {
                count++;
            }
        }
        System.out.println(count);
    }
}
