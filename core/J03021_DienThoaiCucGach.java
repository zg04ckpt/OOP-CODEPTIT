
package core;

import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    private static boolean check(String s) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length/2; i++) {
            if(c[i] != c[c.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] map = new int[256];
        map['A'] = 2;
        map['B'] = 2;
        map['C'] = 2;
        
        map['D'] = 3;
        map['E'] = 3;
        map['F'] = 3;
        
        map['G'] = 4;
        map['H'] = 4;
        map['I'] = 4;
        
        map['J'] = 5;
        map['K'] = 5;
        map['L'] = 5;
        
        map['M'] = 6;
        map['N'] = 6;
        map['O'] = 6;
        
        map['P'] = 7;
        map['Q'] = 7;
        map['R'] = 7;
        map['S'] = 7;
        
        map['T'] = 8;
        map['U'] = 8;
        map['V'] = 8;
        
        map['W'] = 9;
        map['X'] = 9;
        map['Y'] = 9;
        map['Z'] = 9;
        
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next().toUpperCase();
            String n = "";
            for(char c : s.toCharArray()) {
                n += map[c];
            }
            System.out.println(check(n)? "YES":"NO");
        }
    }

}
