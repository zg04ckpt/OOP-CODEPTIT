
package core;

import java.util.Scanner;
import java.util.TreeSet;

public class J03009_TapTuRiengCua2Xau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            TreeSet<String> a = new TreeSet<>();
            String[] words = sc.nextLine().trim().split("\\s+");
            for(String w : words) {
                a.add(w);
            }
            
            TreeSet<String> b = new TreeSet<>();
            words = sc.nextLine().trim().split("\\s+");
            for(String w : words) {
                b.add(w);
            }
            
            for(String w : a) {
                if(!b.contains(w)) {
                    System.out.print(w + " ");
                }
            }
            System.out.println();
        }
    }
    


}
