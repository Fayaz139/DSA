package loops;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int pc = 0;
        int nc = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= n-1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i <= n-1; i++) {
//            if (a[i] == 0) {
//                even += 1;
//            }
            if (a[i] > 0) {
                pc += 1;
            }
            else if (a[i] < 0){
                nc += 1;
            }
            if (a[i] % 2 == 0)
                even += 1;
            else
                odd += 1;
        }
        System.out.println(pc);
        System.out.println(nc);
        System.out.println(even);
        System.out.println(odd);
    }
}
