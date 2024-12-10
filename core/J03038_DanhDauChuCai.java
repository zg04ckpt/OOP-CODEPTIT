
package core;

import java.util.HashSet;
import java.util.Scanner;

public class J03038_DanhDauChuCai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        for(char c : sc.next().toCharArray()) {
            set.add(c);
        }
        System.out.println(set.size());
    }

}
