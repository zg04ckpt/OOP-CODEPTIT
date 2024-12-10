
package file.j07037_danhSachDoanhNghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        
        ArrayList<Enterprise> enterprises = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            enterprises.add(new Enterprise(
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine())
            ));
        }
        
        Collections.sort(enterprises);
        
        for(Enterprise e : enterprises) {
            System.out.println(e);
        }
        
        sc.close();
    }

}
