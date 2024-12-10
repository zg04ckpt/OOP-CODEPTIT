
package other;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class J08010_TimTuThuanNghichDaiNhat {
    
    private static boolean checkValid(String s) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length/2; i++) {
            if(c[i] != c[c.length-i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLen = 0;
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()) {
            String s = sc.next();
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else if(checkValid(s)) {
                map.put(s, 1);
                maxLen = Math.max(maxLen, s.length());
            }
        }
        
        for(String key : map.keySet()) {
            if(key.length() == maxLen) {
                System.out.println(key + " " + map.get(key));
            }
        }
        
        sc.close();
    }

}
