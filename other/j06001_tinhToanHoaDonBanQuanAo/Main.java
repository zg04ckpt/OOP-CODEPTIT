
package other.j06001_tinhToanHoaDonBanQuanAo;

import other.j06002_sapXepHoaDonBanQuanAo.Product;
import other.j06002_sapXepHoaDonBanQuanAo.Invoice;
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
        for(int i = 1; i <= m; i++) {
            String code = sc.next();
            int quantity = sc.nextInt();
            Product p = products.get(code.substring(0, 2));
            Invoice invoice = new Invoice(
                    String.format("%s-%03d", code, i),
                    p,
                    quantity
            );
            System.out.println(invoice);
        }
    }

}


