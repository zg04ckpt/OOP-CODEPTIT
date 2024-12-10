
package other.jkt014_dauTuChungKhoan;


public class Pair {
    private int val, i;

    public Pair(int val, int i) {
        this.val = val;
        this.i = i;
    }

    public int getI() {
        return i;
    }
    
    public boolean isGreaterThan(int val) {
        return this.val > val;
    }
}
