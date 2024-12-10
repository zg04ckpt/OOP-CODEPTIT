
package other;

import java.util.Scanner;
import java.util.Stack;

public class J08022_phanTuBenPhaiDauTienLLonHon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Stack<Integer> stack = new Stack<>();
            int[] res = new int[n];
            for(int i = n-1; i >= 0; i--) {
                while(!stack.empty() && stack.peek() <= a[i]) {
                    stack.pop();
                }
                if(stack.empty()) {
                    res[i] = -1;
                } else {
                    res[i] = stack.peek();
                }
                stack.push(a[i]);
            }
            
            for(int e : res) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

}
