
package core;

import java.util.Scanner;

public class J03032_DaoTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String[] words = sc.nextLine().trim().split("\\s+");
            for(String word : words) {
                System.out.print(new StringBuilder(word).reverse().toString() + " ");
            }
            System.out.println();
        }
    }

}


