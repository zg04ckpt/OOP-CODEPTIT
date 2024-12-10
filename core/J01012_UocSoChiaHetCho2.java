
package core;

import java.util.Scanner;

public class J01012_UocSoChiaHetCho2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    if(i % 2 == 0) {
                        count++;
                    }
                    int m = n / i;
                    if(m % 2 == 0 && m != i) {
                        count++;
                    }
                }
            }
            if(n % 2 == 0) {
                count++;
            }
            System.out.println(count);
        }
    }

}
