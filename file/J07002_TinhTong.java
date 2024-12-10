
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TinhTong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()) {
            String value = sc.next();
            try {
                sum += Integer.parseInt(value);
            } catch (Exception e) {
            }
        }
        System.out.println(sum);
    }

}
