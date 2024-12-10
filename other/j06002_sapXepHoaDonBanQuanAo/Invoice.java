
package other.j06002_sapXepHoaDonBanQuanAo;


public class Invoice implements Comparable<Invoice> {
    private String id;
    private Product product;
    private double reduce, pay;

    public Invoice(String id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        
        double price = 0;
        if(id.charAt(2) == '1') {
            price = quantity * product.getPrice1();
        } else {
            price = quantity * product.getPrice2();
        }
        
        if(quantity >= 150) {
            this.reduce = 0.5 * price;
        } else if(quantity >= 100) {
            this.reduce = 0.3 * price;
        } else if(quantity >= 50) {
            this.reduce = 0.15 * price;
        } else {
            this.reduce = 0;
        }
        
        this.pay = price - this.reduce;
    }

    @Override
    public String toString() {
        return id + " " + 
                product.getName() + " " +
                String.format("%d %d", (int)reduce, (int)pay);
    }

    @Override
    public int compareTo(Invoice o) {
        return Double.compare(o.pay, this.pay);
    }
    
    
    
}
