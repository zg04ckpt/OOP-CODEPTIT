
package core;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J02007_DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            while(n-- > 0) {
                int m = sc.nextInt();
                map.put(m, map.getOrDefault(m, 0) + 1);
            }
            System.out.println("Test " + k + ":");
            for(Integer key : map.keySet()) {
                System.out.println(String.format("%d xuat hien %d lan", key, map.get(key)));
            }
        }
    }

}
