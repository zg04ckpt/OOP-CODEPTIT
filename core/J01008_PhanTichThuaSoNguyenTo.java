
package core;

import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            System.out.print(String.format("Test %d: ", k));
            for(int i = 2; i <= Math.sqrt(n); i++) {
                int count = 0;
                while (n % i == 0) {                    
                    count++;
                    n /= i;
                }
                if(count > 0) {
                    System.out.print(String.format("%d(%d) ", i, count));
                }
            }
            if(n > 1) {
                System.out.print(String.format("%d(1)", n));
            }
            System.out.println();
        }
    }

}
