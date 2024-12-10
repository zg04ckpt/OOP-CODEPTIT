
package other.j06002_sapXepHoaDonBanQuanAo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> products = new HashMap<>();
        while(n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price1 = Integer.parseInt(sc.nextLine());
            int price2 = Integer.parseInt(sc.nextLine());
            products.put(id, new Product(id, name, price1, price2));
        }
        
        int m = sc.nextInt();
        ArrayList<Invoice> invoices = new ArrayList<>();
        for(int i = 1; i <= m; i++) {
            String code = sc.next();
            int quantity = sc.nextInt();
            Product p = products.get(code.substring(0, 2));
            invoices.add(new Invoice(
                    String.format("%s-%03d", code, i),
                    p,
                    quantity
            ));
        }
        
        Collections.sort(invoices);
        
        for(Invoice i : invoices) {
            System.out.println(i);
        }
    }

}




