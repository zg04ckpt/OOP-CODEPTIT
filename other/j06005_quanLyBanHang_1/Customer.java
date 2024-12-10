
package other.j06005_quanLyBanHang_1;


public class Customer {
    private String id, name, gender, dob, address;

    public Customer(String id, String name, String gender, String dob, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}
