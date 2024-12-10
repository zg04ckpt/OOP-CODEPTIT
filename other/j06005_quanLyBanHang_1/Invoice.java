
package other.j06005_quanLyBanHang_1;

import other.j06006_quanLyBanHang_2.Product;
import other.j06006_quanLyBanHang_2.Customer;


public class Invoice {
    private String id;
    private Customer customer;
    private Product product;
    private int quantity;

    public Invoice(String id, Customer customer, Product product, int quantity) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + " " +
                customer + " " + 
                product + " " +
                quantity + " " + 
                (quantity * product.getSellPrice());
    }
    
    
}
