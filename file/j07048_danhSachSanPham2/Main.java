
package file.j07048_danhSachSanPham2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        while(n-- > 0) {
            products.add(new Product(
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())
            ));
        }
        
        Collections.sort(products);
        
        for(Product p : products) {
            System.out.println(p);
        }
    }

}
