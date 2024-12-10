
package core;

import java.util.Scanner;

public class J03006_SoDep1 {
    private static boolean check(String n) {
        char[] c = n.toCharArray();
        for(int i = 0; i < c.length / 2; i++) {
            if(c[i] != c[c.length-1-i]) {
                return false;
            }
            if((c[i]-'0') % 2 == 1) {
                return false;
            }
        }
        return true;
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