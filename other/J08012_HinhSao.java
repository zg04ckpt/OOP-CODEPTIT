
package other;

import java.util.HashMap;
import java.util.Scanner;

public class J08012_HinhSao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> g = new HashMap<>();
       for(int i = 1; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.put(u, g.getOrDefault(u, 0) + 1);
            g.put(v, g.getOrDefault(v, 0) + 1);
        }
        
        int cnt = 0, cntStar = 0;
        for(Integer u : g.keySet()) {
            if(g.get(u) == 1) {
                cnt++;
            } else if(g.get(u) == n-1) {
                cntStar++;
            }
        } 
        
        if(cnt == n-1 && cntStar == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
