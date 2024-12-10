
package file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

public class J07005_SoKhacNhauTrongFile_2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(dis.available() > 0) {
            int n = dis.readInt();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
