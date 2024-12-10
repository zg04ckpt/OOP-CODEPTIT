
package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class J07030_CapSoNguyenToTrongFile_1 {
    
    private static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> l1 = (ArrayList<Integer>) ois.readObject();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l2 = (ArrayList<Integer>) ois.readObject();
        
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.addAll(l1);
        
        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(l2);
        
        for(Integer n : set1) {
            int m = 1000000 - n;
            if(!set2.contains(m) || n >= m || !isPrime(n) || !isPrime(m)) {
                continue;
            }
            System.out.println(n + " " + m);
        }
        
        ois.close();
    }

}
