
package core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class J02034_BoSungDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        while(n-- > 0) {
            set.add(sc.nextInt());
        }
        
        int max = Collections.max(set);
        if (max == set.size()) {
            System.out.println("Excellent!");
        } else {
            for(int i = 1; i <= max; i++) {
                if(!set.contains(i)) {
                    System.out.println(i);
                }
            }
        }
    }

}
