
package core;

import java.util.Scanner;

public class J02105_DanhSachKe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print(String.format("List(%d) = ", i));
            for(int j = 1; j <= n; j++) {
                if(sc.nextInt() == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

}
