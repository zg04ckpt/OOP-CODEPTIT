
package file.j07056_tinhTienDien;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Customer implements Comparable<Customer> {
    private String id, name, type;
    private int price, over, vat, total;

    public Customer(String id, String name, String type, int start, int end) {
        this.id = id;
        this.name = formatName(name);
        this.type = type;
        
        int used = end - start;
        if(type.equals("A")) {
            if(used <= 100) {
                this.price = used * 450;
                this.over = 0;
            } else {
                this.price = 100 * 450;
                this.over = (used - 100) * 1000;
            }
        } else if(type.equals("B")) {
            if(used <= 500) {
                this.price = used * 450;
                this.over = 0;
            } else {
                this.price = 500 * 450;
                this.over = (used - 500) * 1000;
            }
        } else {
            if(used <= 200) {
                this.price = used * 450;
                this.over = 0;
            } else {
                this.price = 200 * 450;
                this.over = (used - 200) * 1000;
            }
        }
        
        this.vat = this.over / 20;        
        this.total = this.price + this.over + this.vat;

    }
    
    private String formatName(String name) {
        return Arrays.stream(name.trim().split("\\s+"))
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " + 
                price + " " + 
                over + " " + 
                vat + " " + 
                total;
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(o.total, this.total);
    }
    
    
}
