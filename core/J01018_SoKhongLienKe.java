
package core;

import java.math.MathContext;
import java.util.Scanner;

public class J01018_SoKhongLienKe {
    private static boolean check(String n) {
        char[] c = n.toCharArray();
        int sum = c[0] - '0';
        for(int i = 1; i < c.length; i++) {
            if(Math.abs(c[i]-c[i-1]) != 2) {
                return false;
            }
            sum += c[i]-'0';
        }
        return sum%10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String n = sc.next();
            System.out.println(check(n)? "YES":"NO");
        }
    }

}
