
package file.j07054_tinhDiemTrungBinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            students.add(new Student(
                    String.format("SV%02d", i),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        Collections.sort(students);
        
        System.out.println(students.get(0) + " 1");
        int rank = 1;
        for(int i = 1; i < n; i++) {
            if(students.get(i).getScore() != students.get(i-1).getScore()) {
                rank = i+1;
            }
            System.out.println(students.get(i) + " " + rank);
        }
    }

}


