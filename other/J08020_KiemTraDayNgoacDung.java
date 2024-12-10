
package other;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class J08020_KiemTraDayNgoacDung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');
        
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            for(char c : s.toCharArray()) {
                if(!stack.empty() && map.getOrDefault(c, '-').equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            
            System.out.println(stack.empty()? "YES":"NO");
        }
    }

}
