
package other.jkt014_dauTuChungKhoan;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Pair> stack = new Stack<>();
            int[] result = new int[n];
            for(int i = 0; i < n; i++) {
                while(!stack.empty() && !stack.peek().isGreaterThan(a[i])) {
                    stack.pop();
                }
                if(stack.empty()) {
                    result[i] = i + 1;
                } else {
                    result[i] = i - stack.peek().getI();
                }
                stack.push(new Pair(a[i], i));
            }
            
            for(int e : result) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

}
