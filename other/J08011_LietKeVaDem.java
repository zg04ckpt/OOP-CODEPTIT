
package other;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class J08011_LietKeVaDem {
    
    private static boolean checkValid(int n) {
        char[] c = String.valueOf(n).toCharArray();
        for(int i = 1; i < c.length; i++) {
            if(c[i-1] > c[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else if(checkValid(n)) {
                map.put(n, 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> list = map
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toList());
        
        for(Map.Entry<Integer, Integer> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}
