
package file.j07056_tinhTienDien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        
        int n = sc.nextInt();
        ArrayList<Customer> customers = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            sc.nextLine();
            customers.add(new Customer(
                    String.format("KH%02d", i),
                    sc.nextLine(),
                    sc.next(),
                    sc.nextInt(),
                    sc.nextInt()
            ));
        }
        
        Collections.sort(customers);
        
        for(Customer c : customers) {
            System.out.println(c);
        }
        
        sc.close();
    }

}
