
package core;

import java.util.Scanner;

public class J01026_SoChinhPhuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = (int)Math.sqrt(n);
            System.out.println(n == m*m? "YES":"NO");
        }
    }

}
