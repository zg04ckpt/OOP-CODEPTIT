
package other.j06007_bangTiinhGioChuan;


public class Lecturer {
    private String id, name;
    private double hours;

    public Lecturer(String id, String name) {
        this.id = id.trim();
        this.name = name.trim();
        this.hours = 0;
    }
    
    public void gainHour(double val) {
        this.hours += val;
    }

    @Override
    public String toString() {
        return name + " " + 
                String.format("%.2f", hours);
    }
}
