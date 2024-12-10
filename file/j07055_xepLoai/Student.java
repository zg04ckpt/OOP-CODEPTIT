
package file.j07055_xepLoai;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Student implements Comparable<Student> {
    private String id, name;
    private double score;
    private String rank;

    public Student(String id, String name, double s1, double s2, double s3) {
        this.id = id;
        this.name = formatName(name);
        this.score = s1 * 0.25 + s2 * 0.35 + s3 * 0.4;
        if(this.score >= 8) {
            this.rank = "GIOI";
        } else if(this.score >= 6.5) {
            this.rank = "KHA";
        } else if(this.score >= 5) {
            this.rank = "TRUNG BINH";
        } else {
            this.rank = "KEM";
        }
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
                String.format("%.2f", score) + " " +
                rank;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.score, this.score);
    }
}
