
package core;

import java.util.Scanner;

public class J01009_TongGiaiThua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0, p = 1;
        for(int i = 1; i <= n; i++) {
            p *= i;
            ans += p;
        }
        System.out.println(ans);
    }

}
