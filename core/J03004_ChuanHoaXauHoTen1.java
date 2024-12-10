
package core;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class J03004_ChuanHoaXauHoTen1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            String[] words = sc.nextLine().trim().split("\\s+");
            String name = Arrays.stream(words)
                    .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                    .collect(Collectors.joining(" "));
            System.out.println(name);
        } 
    }
}



