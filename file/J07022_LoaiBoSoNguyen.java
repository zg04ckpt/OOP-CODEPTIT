
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022_LoaiBoSoNguyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()) {
            String e = sc.next();
            try {
                Integer.parseInt(e);
            } catch (Exception ex) {
                list.add(e);
            }
        }
        
        Collections.sort(list);
        
        for(String e : list) {
            System.out.print(e + " ");
        }
    }

}
