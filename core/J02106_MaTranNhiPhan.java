
package core;

import java.util.Scanner;

public class J02106_MaTranNhiPhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n-- > 0) {
            if(sc.nextInt() + sc.nextInt() + sc.nextInt() >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }

}
