
package core;

import java.util.Scanner;

public class J01025_HinhVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxX = -1001;
        int maxY = -1001;
        int minX = 1001;
        int minY = 1001;
        for(int i = 1; i <= 4; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
            
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
        }
        
        int c = Math.max(maxX - minX, maxY - minY);
        System.out.println(c * c);
    }

}
