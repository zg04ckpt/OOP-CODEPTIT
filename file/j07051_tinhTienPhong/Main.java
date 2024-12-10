
package file.j07051_tinhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            customers.add(new Customer(
                    String.format("KH%02d", i),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine())
            ));
        }
        
        Collections.sort(customers);
        
        for(Customer c : customers) {
            System.out.println(c);
        }
        
        sc.close();
    }

}
