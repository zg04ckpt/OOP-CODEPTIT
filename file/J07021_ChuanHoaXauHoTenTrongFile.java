
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class J07021_ChuanHoaXauHoTenTrongFile {
    
    private static String convert(String name) {
        return Arrays.stream(name.trim().split("\\s+"))
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true) {
            String s = sc.nextLine();
            if(s.equals("END")) {
                break;
            }
            System.out.println(convert(s));
        }
    }

}
