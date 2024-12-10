
package core;

import java.util.Scanner;

public class J01010_CatDoi {
    private static String convert(String s) {
        String ans = "";
        for(char c : s.toCharArray()) {
            if(c == '0' || c == '8' || c == '9') {
                if(ans.length() > 0) {
                    ans += '0';
                }
            } else if(c == '1') {
                ans += '1';
            } else {
                return "INVALID";
            }
        }
        return ans.length() == 0? "INVALID":ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            System.out.println(convert(s));
        }
    }

}
