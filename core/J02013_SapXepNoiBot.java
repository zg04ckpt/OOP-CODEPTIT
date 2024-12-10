
package core;

import java.util.Scanner;

public class J02013_SapXepNoiBot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        
        int count = 1;
        while(true) {
            boolean isSorted = true;
            for(int i = 1; i < n; i++) {
                if(a[i-1] > a[i]) {
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    isSorted = false;
                }
            }
            
            if(isSorted) {
                break;
            }
            
            System.out.print("Buoc " + count++ + ": ");
            for(int e : a) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

}
