
package core;

import java.util.Scanner;

public class J02014_SanhSachCanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(sc.nextInt() == 1 && j > i) {
                    System.out.println(String.format("(%d,%d)", i, j));
                }
            }
        }
    }

}
