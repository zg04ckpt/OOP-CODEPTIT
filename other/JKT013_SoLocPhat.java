
package other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013_SoLocPhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            Queue<String> queue = new LinkedList<>();
            ArrayList<String> result = new ArrayList<>();
            queue.add("6");
            queue.add("8");
            while(!queue.isEmpty()) {
                String m = queue.poll();
                result.add(0, m);
                if(m.length() < n) {
                    queue.add(m + "6");
                    queue.add(m + "8");
                }
            }
            
            System.out.println(result.size());
            for(String e : result) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

}
