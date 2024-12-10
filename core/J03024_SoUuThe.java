
package core;

import java.util.Scanner;

public class J03024_SoUuThe {
    private static String check(String n) {
        if(n.charAt(0) == '0') {
            return "INVALID";
        }
        
        int odd = 0;
        for(char c : n.toCharArray()) {
            if(c < '0' || c > '9') {
                return "INVALID";
            }
            if((c-'0')%2 == 1) {
                odd++;
            }
        }
        
        if(n.length() % 2 == 0 && n.length()-odd > odd) {
            return "YES";
        }
        
        if(n.length() % 2 == 1 && n.length()-odd < odd) {
            return "YES";
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String n = sc.next();
            System.out.println(check(n));
        }
    }

}
