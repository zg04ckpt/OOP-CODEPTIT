
package file.j07048_danhSachSanPham2;


public class Product implements Comparable<Product> {
    private String id, name;
    private int price, warranty;

    public Product(String id, String name, int price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                price + " " +
                warranty;
    }

    @Override
    public int compareTo(Product o) {
        if(this.price != o.price) {
             return Integer.compare(o.price, this.price);
        }
        return this.id.compareTo(o.id);
    }
}
