
package other.j06001_tinhToanHoaDonBanQuanAo;


public class Product {
    private String id, name;
    private int price1, price2;

    public Product(String id, String name, int price1, int price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getName() {
        return name;
    }

    public int getPrice1() {
        return price1;
    }

    public int getPrice2() {
        return price2;
    }
    
    
}
