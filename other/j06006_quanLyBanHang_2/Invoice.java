
package other.j06006_quanLyBanHang_2;


public class Invoice implements Comparable<Invoice> {
    private String id;
    private Customer customer;
    private Product product;
    private int quantity, profit;

    public Invoice(String id, Customer customer, Product product, int quantity) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.profit = quantity * product.getProfit();
    }

    @Override
    public String toString() {
        return id + " " +
                customer + " " + 
                product + " " +
                quantity + " " + 
                (quantity * product.getSellPrice()) + " " +
                profit;
    }

    @Override
    public int compareTo(Invoice o) {
        return Integer.compare(o.profit, this.profit);
    }
}
