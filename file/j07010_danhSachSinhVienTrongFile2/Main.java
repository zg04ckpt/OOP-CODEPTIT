
package file.j07010_danhSachSinhVienTrongFile2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<Student> students = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            students.add(new Student(
                    String.format("B20DCCN%03d", i),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        for(Student s : students) {
            System.out.println(s);
        }
    }

}
