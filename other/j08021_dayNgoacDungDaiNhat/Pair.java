
package other.j08021_dayNgoacDungDaiNhat;


public class Pair {
    private char c;
    private int i;

    public Pair(char c, int i) {
        this.c = c;
        this.i = i;
    }

    public int getI() {
        return i;
    }
    
    public boolean isValidWithNext(char next) {
        return c == '(' && next == ')';
    }
}
