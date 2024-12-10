
package file.j07050_sapXepMatHang;


public class Item implements Comparable<Item> {
    private String id, name, group;
    private double buyPrice, sellPrice, profit;

    public Item(String id, String name, String group, double buyPrice, double sellPrice) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - buyPrice;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                group + " " +
                String.format("%.2f", profit);
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(o.profit, this.profit);
    }
    
   
}
