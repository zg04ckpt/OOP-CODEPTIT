
package core;

import java.util.Scanner;

public class J01017_SoLienKe {
    private static boolean check(String n) {
        char[] c = n.toCharArray();
        for(int i = 1; i < c.length; i++) {
            if(Math.abs(c[i]-c[i-1]) != 1) {
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
