
package core;
import java.util.ArrayList;
import java.util.Scanner;

public class J02012_SapXepChen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int e : a) {
            boolean isInserted = false;
            for(int i = 0; i < ans.size(); i++) {
                if(e < ans.get(i)) {
                    ans.add(i, e);
                    isInserted = true;
                    break;
                }
            }
            
            if(!isInserted) {
                ans.add(e);
            }
            
            System.out.print("Buoc " + (ans.size()-1) + ": ");
            for(Integer num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
