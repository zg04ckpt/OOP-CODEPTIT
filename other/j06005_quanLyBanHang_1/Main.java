
package other.j06005_quanLyBanHang_1;
import other.j06006_quanLyBanHang_2.Product;
import other.j06006_quanLyBanHang_2.Invoice;
import other.j06006_quanLyBanHang_2.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Customer> customers = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            String id = String.format("KH%03d", i);
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            customers.put(id, new Customer(id, name, gender, dob, address));
        }
        
        n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> products = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            String id = String.format("MH%03d", i);
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int buyPrice = Integer.parseInt(sc.nextLine());
            int sellPrice = Integer.parseInt(sc.nextLine());
            products.put(id, new Product(id, name, unit, buyPrice, sellPrice));
        }
        
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            Invoice invoice = new Invoice(
                    String.format("HD%03d", i),
                    customers.get(sc.next()),
                    products.get(sc.next()),
                    sc.nextInt()
            );
            System.out.println(invoice);
        }
    }
}




