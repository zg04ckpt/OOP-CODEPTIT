
package other.j06003_quanLyBaiTapNhom_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<Integer, ArrayList<Student>> students = new LinkedHashMap<>();
        while(n-- > 0) {
            Student student = new Student(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            );
            int groupOrder = Integer.parseInt(sc.nextLine());
            if(!students.containsKey(groupOrder)) {
                students.put(groupOrder, new ArrayList<>());
            }
            students.get(groupOrder).add(student);
        }
        
        HashMap<Integer, String> groupNames = new HashMap<>();
        for(int i = 1; i <= m; i++) {
            groupNames.put(i, sc.nextLine());
        }
        
        int q = sc.nextInt();
        while(q-- > 0) {
            int groupOrder = sc.nextInt();
            System.out.println(String.format("DANH SACH NHOM %d:", groupOrder));
            for(Student s : students.get(groupOrder)) {
                System.out.println(s);
            }
            System.out.println("Bai tap dang ky: " + groupNames.get(groupOrder));
        }
        
        sc.close();
    }

}


