
package core;

import java.util.Scanner;
import java.util.Stack;

public class J02017_ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while(n-- > 0) {
            int m = sc.nextInt();
            if(stack.empty() || (stack.peek() + m) % 2 == 1) {
                stack.add(m);
            } else {
                stack.pop();
            }
        } 
        
        System.out.println(stack.size());
    }

}
