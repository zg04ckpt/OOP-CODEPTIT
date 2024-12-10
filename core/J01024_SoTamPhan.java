
package core;

import java.util.Scanner;

public class J01024_SoTamPhan {
    private static boolean check(String n) {
        for(char c : n.toCharArray()) {
            if(c > '2') {
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
