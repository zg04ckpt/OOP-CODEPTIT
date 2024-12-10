
package file.j07045_loaiPhong;

import java.util.Scanner;


public class LoaiPhong implements Comparable<LoaiPhong> {
    private String type, name;
    private int price;
    private double serveFee;

    public LoaiPhong(String src) {
        Scanner sc = new Scanner(src);
        this.type = sc.next();
        this.name = sc.next();
        this.price = sc.nextInt();
        this.serveFee = sc.nextDouble();
    }

    @Override
    public String toString() {
        return type + " " +
                name + " " + 
                price + " " + 
                serveFee;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}
