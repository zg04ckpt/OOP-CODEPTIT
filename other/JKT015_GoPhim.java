
package other;

import java.util.Scanner;
import java.util.Stack;

public class JKT015_GoPhim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        Stack<Character> before = new Stack<>();
        Stack<Character> after = new Stack<>();
        
        for(char c : s.toCharArray()) {
            switch (c) {
                case '<':
                    if(!before.empty()) {
                        after.push(before.pop());
                    }
                    break;
                case '>':
                    if(!after.empty()) {
                        before.push(after.pop());
                    }
                    break;
                case '-':
                    if(!before.empty()) {
                        before.pop();
                    }
                    break;
                default:
                    before.push(c);
            }
        }
        
        while(!before.empty()) {
            after.push(before.pop());
        }
        while(!after.empty()) {
            System.out.print(after.pop());
        }
        System.out.println();
    }

}
