
package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07015_SoNguyenToTrongFileNhiPhan {
    
    private static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer n : a) {
            if(isPrime(n)) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        for(Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
