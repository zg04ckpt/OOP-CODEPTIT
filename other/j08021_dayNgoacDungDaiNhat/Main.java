
package other.j08021_dayNgoacDungDaiNhat;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            Stack<Pair> stack = new Stack<>();
            stack.push(new Pair(')', -1));
            for(int i = 0; i < s.length(); i++) {
                if(!stack.empty() && stack.peek().isValidWithNext(s.charAt(i))) {
                    stack.pop();
                } else {
                    stack.push(new Pair(s.charAt(i), i));
                }
            }
            
            int nextI = s.length();
            int max = 0;
            while(!stack.empty()) {
                int curI = stack.pop().getI();
                max = Math.max(max, nextI - curI - 1);
                nextI = curI;
            }
            System.out.println(max);
        }
    }

}
