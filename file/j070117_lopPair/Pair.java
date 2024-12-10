
package file.j070117_lopPair;


public class Pair<T1, T2> {
    private T1 t1;
    private T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    
    private boolean checkPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    
    public boolean isPrime() {
        try {
            int a = Integer.parseInt(t1.toString());
            int b = Integer.parseInt(t2.toString());
            if(checkPrime(a) && checkPrime(b)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return t1.toString() + " " + t2.toString();
    }
    
    
}
