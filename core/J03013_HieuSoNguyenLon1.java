
package core;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String x = sc.next();
            String y = sc.next();
            int maxLen = Math.max(x.length(), y.length());
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            String ans = a.subtract(b).abs().toString();
            while(ans.length() < maxLen) {
                ans = '0' + ans;
            }
            System.out.println(ans);
        }
    }

}
