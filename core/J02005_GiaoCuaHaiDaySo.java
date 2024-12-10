
package core;

import java.util.Scanner;
import java.util.TreeSet;

public class J02005_GiaoCuaHaiDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        while(n-- > 0) {
            a.add(sc.nextInt());
        }
        
        TreeSet<Integer> b = new TreeSet<>();
        while(m-- > 0) {
            b.add(sc.nextInt());
        }
        
        for(Integer e : a) {
            if(b.contains(e)) {
                System.out.print(e + " ");
            }
        }
    }

}
