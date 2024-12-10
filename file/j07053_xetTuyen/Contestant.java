
package file.j07053_xetTuyen;

import java.math.MathContext;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Contestant {
    private String id, name, rank;
    private int age;
    private int s;

    public Contestant(String id, String name, String dob, double s1, double s2) {
        this.id = id;
        this.name = formatName(name);
        this.age = calcAge(dob);
        //calc score
        double score = (s1 + s2)/2;
        if(s1 >= 8 && s2 >= 8) {
            score += 1;
        } else if(s1 >= 7.5 && s2 >= 7.5) {
            score += 0.5;
        }
        this.s = (int)Math.round(score);
        if(s > 10) {
            s = 10;
        }
        
        if(s >= 9) {
            this.rank = "Xuat sac";
        } else if(s >= 8) {
            this.rank = "Gioi";
        } else if(s >= 7) {
            this.rank = "Kha";
        } else if(s >= 5) {
            this.rank = "Trung binh";
        } else {
            this.rank = "Truot";
        }
    }
    
    private String formatName(String name) {
        return Arrays.stream(name.trim().split("\\s+"))
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
    
    private int calcAge(String dob) {
        int year = Integer.parseInt(dob.trim().split("/")[2]);
        return 2021 - year;
    } 

    @Override
    public String toString() {
        return id + " " + 
                name + " " +
                age + " " +
                s + " " +
                rank;
    }
    
    
}
