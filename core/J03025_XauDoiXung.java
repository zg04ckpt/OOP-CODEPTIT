
package core;

import java.util.Scanner;

public class J03025_XauDoiXung {
    private static int count(String n) {
        char[] c = n.toCharArray();
        int cnt = 0;
        for(int i = 0; i < c.length/2; i++) {
            if(c[i] != c[c.length-1-i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            int wrong = count(s);
            if(s.length() % 2 == 0) {
                System.out.println(wrong == 1? "YES":"NO");
            } else {
                System.out.println(wrong <= 1? "YES":"NO");
            }
        }
    }

}
