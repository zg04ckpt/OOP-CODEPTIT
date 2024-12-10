
package core;

import java.util.Scanner;

public class J01016_SoChuSo4VChuSo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for(char c : n.toCharArray()) {
            if(c == '4' || c == '7') {
                count++;
            }
        }
        System.out.println((count == 4 || count == 7)? "YES":"NO");
    }

}
