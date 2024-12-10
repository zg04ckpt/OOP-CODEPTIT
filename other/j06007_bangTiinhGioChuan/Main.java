
package other.j06007_bangTiinhGioChuan;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n-- > 0) {
            sc.next();
            sc.nextLine();
        }
        
        LinkedHashMap<String, Lecturer> lecturers = new LinkedHashMap<>();
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            String id  = sc.next();
            String name = sc.nextLine();
            lecturers.put(id, new Lecturer(id, name));
        }
        
        n = sc.nextInt();
        while(n-- > 0) {
            String lecId = sc.next();
            String subId = sc.next();
            double hours = sc.nextDouble();
            lecturers.get(lecId).gainHour(hours);
        }
        
        for(String key : lecturers.keySet()) {
            System.out.println(lecturers.get(key));
        }
       
        sc.close();
    }

}


