
package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class J07029_SoNguyenToLonNhatTrongFile {
    
    private static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for(Integer e : list) {
            if(isPrime(e)) {
                map.put(e, map.getOrDefault(e, 0) + 1);
            }
        }
        int count = 10;
        for(Integer key : map.keySet()) {
            if(count-- > 0) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }

}
