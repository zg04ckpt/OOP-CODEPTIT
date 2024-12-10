
package core;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class J03005_ChuanHoaXauHoTen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            String[] words = sc.nextLine().trim().split("\\s+");
            for(int i = 1; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() 
                        + words[i].substring(1).toLowerCase();
                System.out.print(words[i]);
                if(i == words.length-1) {
                    System.out.print(",");
                }
                System.out.print(" ");
            }
            System.out.println(words[0].toUpperCase());
        } 
    }
}


