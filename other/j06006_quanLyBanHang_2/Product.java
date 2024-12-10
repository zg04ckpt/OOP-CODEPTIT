
package other.j06006_quanLyBanHang_2;


public class Product {
    private String id, name, unit;
    private int buyPrice, sellPrice;

    public Product(String id, String name, String unit, int buyPrice, int sellPrice) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getSellPrice() {
        return sellPrice;
    }
    
    public int getProfit() {
        return sellPrice - buyPrice;
    }
}
