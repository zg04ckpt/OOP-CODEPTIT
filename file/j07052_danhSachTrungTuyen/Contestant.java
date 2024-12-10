
package file.j07052_danhSachTrungTuyen;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Contestant implements Comparable<Contestant> {
    private String id, name, status;
    private double s, prio;

    public Contestant(String id, String name, double s1, double  s2, double s3) {
        this.id = id;
        this.name = formatName(name);
        this.s = s1 * 2 + s2 + s3;
        
        switch (id.substring(0, 3)) {
            case "KV1":
                this.prio = 0.5;
                break;
            case "KV2":
                this.prio = 1.0;
                break;
            default:
                this.prio = 2.5;
        }
        this.s += this.prio;
    }

    public double getS() {
        return s;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    private String formatName(String name) {
        return Arrays.stream(name.trim().split("\\s+"))
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
    
    private String round(double val) {
        if((int)val == val) {
            return (int)val + "";
        }
        return val + "";
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " + 
                round(prio) + " " + 
                round(s) + " " +
                status;
    }

    @Override
    public int compareTo(Contestant o) {
        if(this.s == o.s) {
            return this.id.compareTo(o.id);
        }
        return Double.compare(o.s, this.s);
    }
    
    
}
