
package other.j06004_quanLyBaiTapNhom_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        while(n-- > 0) {
            students.add(new Student(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine())
            ));
        }
        
        HashMap<Integer, String> groupNames = new HashMap<>();
        for(int i = 1; i <= m; i++) {
            groupNames.put(i, sc.nextLine());
        }
        
        Collections.sort(students);
        
        for(Student s : students) {
            System.out.println(s + " " + groupNames.get(s.getGroupId()));
        }
    }

}

