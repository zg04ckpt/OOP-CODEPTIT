
package core;

import java.math.BigInteger;
import java.util.Scanner;

public class J03040_BienSoDep {
    private static boolean check(String s) {
        char[] c = s.toCharArray();
        if(c[0] == c[1] && c[1] == c[2] && c[3] == c[4]) {
            return true;
        }
        
        boolean equal = true, asc = true, is68 = true;
        for(int i = 0; i < c.length; i++) {
            if(c[i] != '6' && c[i] != '8') {
                is68 = false;
            }
            if(i > 0) {
                if(c[i] != c[i-1]) {
                    equal = false;
                }
                if(c[i] <= c[i-1]) {
                    asc = false;
                }
            }
        }
        
        return equal || asc || is68;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            String bs = s.substring(5, 8) + s.substring(9);
            System.out.println(check(bs)? "YES":"NO");
        }
    }

}
