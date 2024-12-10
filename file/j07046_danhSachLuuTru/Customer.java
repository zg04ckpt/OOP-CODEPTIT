
package file.j07046_danhSachLuuTru;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Customer implements Comparable<Customer> {
    private String id, name, roomId;
    private LocalDate arriveDate, outDate;
    private long numberOfDays;

    public Customer(String id, String name, String roomId, String arriveDate, String outDate) {
        this.id = id;
        this.name = name;
        this.roomId = roomId;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.arriveDate = LocalDate.parse(arriveDate, formatter);
        this.outDate = LocalDate.parse(outDate, formatter);
        this.numberOfDays = ChronoUnit.DAYS.between(this.arriveDate, this.outDate);
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " +
                roomId + " " +
                numberOfDays;
    }

    @Override
    public int compareTo(Customer o) {
        return Long.compare(o.numberOfDays, this.numberOfDays);    
    }
    
    
}
