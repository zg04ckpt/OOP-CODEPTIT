
package other.j06004_quanLyBaiTapNhom_2;


public class Student implements Comparable<Student> {
    private String id, name, phoneNumber;
    private int groupId;

    public Student(String id, String name, String phoneNumber, int groupId) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " + 
                phoneNumber + " " + 
                groupId;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    public int getGroupId() {
        return groupId;
    }
}
