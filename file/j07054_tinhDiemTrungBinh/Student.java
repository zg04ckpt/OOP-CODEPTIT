
package file.j07054_tinhDiemTrungBinh;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Student implements Comparable<Student> {
    private String id, name;
    private double score;

    public Student(String id, String name, double s1, double s2, double s3) {
        this.id = id;
        this.name = formatName(name);
        this.score = (s1*3 + s2*3 + s3*2)/8;
        this.score = Math.round(this.score * 100) / 100.0;
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
                String.format("%.2f", score);
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.score, this.score);
    }

    public double getScore() {
        return score;
    }
    
    
}
