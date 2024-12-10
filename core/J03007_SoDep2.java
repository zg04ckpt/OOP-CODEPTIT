
package core;

import java.util.Scanner;

public class J03007_SoDep2 {

    private static boolean check(String n) {
        char[] c = n.toCharArray();
        if(c[0] != '8' || c[c.length-1] != '8') {
            return false;
        }
        int sum = 0;
        for(int i = 0; i < c.length / 2; i++) {
            if(c[i] != c[c.length-1-i]) {
                return false;
            }
            sum += 2 * (c[i]-'0');
        }
        if(c.length % 2 == 1) {
            sum += c[c.length/2]-'0';
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
