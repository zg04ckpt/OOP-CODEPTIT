
package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class J07032_SoThuanNghichTrongFile {
    
    private static boolean check(Integer key) {
        char[] c = key.toString().toCharArray();
        int n = c.length;
        if(n % 2 == 0 || n <= 1) {
            return false;
        }
        for(int i = 0; i < n/2; i++) {
            if(c[i] != c[n-i-1]) {
                return false;
            }
            if((c[i] - '0') % 2 == 0) {
                return false;
            }
        }
        if((c[n/2] - '0') % 2 == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> l1 = (ArrayList<Integer>) ois.readObject();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l2 = (ArrayList<Integer>) ois.readObject();
        
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(Integer e : l1) {
            map1.put(e, map1.getOrDefault(e, 0) + 1);
        }
        
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(Integer e : l2) {
            map2.put(e, map2.getOrDefault(e, 0) + 1);
        }
        
        TreeMap<Integer,Integer> map3 = new TreeMap<>();
        for(Integer key : map1.keySet()) {
            if(map2.containsKey(key) && check(key)) {
                map3.put(key, map1.get(key) + map2.get(key));
            }
        }
        
        int count = 10;
        for(Integer key : map3.keySet()) {
            if(count-- > 0) {
                System.out.println(key + " " + map3.get(key));
            } else {
                break;
            }
        }
        
        ois.close();
    }

}
