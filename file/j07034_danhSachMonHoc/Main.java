
package file.j07034_danhSachMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> subjects = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            subjects.add(new Subject(
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine())
            ));
        }
        
        Collections.sort(subjects);
        
        for(Subject s : subjects) {
            System.out.println(s);
        }
        
        sc.close();
    }

}
