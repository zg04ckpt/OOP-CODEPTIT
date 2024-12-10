
package file.j07051_tinhTienPhong;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Customer implements Comparable<Customer> {
    private String id, name, roomId;
    private LocalDate checkInDate, checkOutDate;
    private int addtionalFee;
    private long dayCount, total, price;

    public Customer(String id, String name, String roomId, String checkInDate, String checkOutDate, int addtionalFee) {
        this.id = id;
        this.name = formatName(name);
        this.roomId = roomId.trim();
      
        this.checkInDate = formatDate(checkInDate);
        this.checkOutDate = formatDate(checkOutDate);
        this.dayCount = ChronoUnit.DAYS.between(this.checkInDate, this.checkOutDate) + 1;
        this.addtionalFee = addtionalFee;
        
        switch (roomId.substring(0, 1)) {
            case "1":
                this.price = 25;
                break;
            case "2":
                this.price = 34;
                break;
            case "3":
                this.price = 50;
                break;
            default:
                this.price = 80;
        }
        
        this.total = this.dayCount * this.price + addtionalFee;
    }
    
    private LocalDate formatDate(String src) {
        String[] w = src.trim().split("/");
        return LocalDate.of(
                Integer.parseInt(w[2]), 
                Integer.parseInt(w[1]),
                Integer.parseInt(w[0]));
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
                roomId + " " + 
                dayCount + " " + 
                total;
    }

    @Override
    public int compareTo(Customer o) {
        return Long.compare(o.total, this.total);
    }
    
   
}
