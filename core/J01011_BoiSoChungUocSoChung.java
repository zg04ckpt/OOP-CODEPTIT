
package core;

import java.math.BigInteger;
import java.util.Scanner;

public class J01011_BoiSoChungUocSoChung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger gcd = a.gcd(b);
            System.out.println(a.multiply(b).divide(gcd) + " " + gcd);
        }
    }

}
