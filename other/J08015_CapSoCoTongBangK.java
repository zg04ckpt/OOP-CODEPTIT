
package other;

import java.util.HashMap;
import java.util.Scanner;

public class J08015_CapSoCoTongBangK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            HashMap<Long, Long> map = new HashMap<>();
            long count = 0;
            while(n-- > 0) {
                long m = sc.nextLong();
                count += map.getOrDefault(k-m, 0L);
                map.put(m, map.getOrDefault(m, 0L) + 1);
            }
            System.out.println(count);
        }
    }

}
