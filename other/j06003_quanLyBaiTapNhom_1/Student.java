
package other.j06003_quanLyBaiTapNhom_1;


public class Student {
    private String id, name, phoneNumber;

    public Student(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return id + " " + 
                name + " " +
                phoneNumber;
    }
}
