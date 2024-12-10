
package core;

import java.util.HashMap;
import java.util.Scanner;

public class J03010_DiaChiEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        while(t-- > 0) {
            String line = sc.nextLine().toLowerCase();
            String[] words = line.trim().split("\\s+");
            String name = words[words.length-1];
            for(int i = 0; i < words.length-1; i++) {
                name += words[i].charAt(0);
            }
            map.put(name, map.getOrDefault(name, 0) + 1);
            if(map.get(name) != 1) {
                name += map.get(name) + "";
            }
            System.out.println(name + "@ptit.edu.vn");
        }
    }

}


