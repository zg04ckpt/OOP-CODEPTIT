
package other;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024_So0VaSo9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            Queue<Long> queue = new LinkedList<>();
            queue.add(9L);
            while(queue.peek() % n != 0) {
                long m = queue.poll();
                queue.add(m * 10);
                queue.add(m * 10 + 9);
            }
            
            System.out.println(queue.peek());
        }
    }

}
