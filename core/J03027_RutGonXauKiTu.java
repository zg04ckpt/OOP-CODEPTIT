
package core;

import java.util.Scanner;
import java.util.Stack;

public class J03027_RutGonXauKiTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(stack.empty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        
        if(stack.empty()) {
            System.out.println("Empty String");
        } else {
            for(Object c : stack.toArray()) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
