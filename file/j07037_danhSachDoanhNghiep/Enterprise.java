
package file.j07037_danhSachDoanhNghiep;


public class Enterprise implements Comparable<Enterprise>{
    private String id, name;
    private int numberOfStudents;

    public Enterprise(String id, String name, int numberOfStudents) {
        this.id = id;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberOfStudents;
    }

    @Override
    public int compareTo(Enterprise o) {
        return this.id.compareTo(o.id);
    }
}
