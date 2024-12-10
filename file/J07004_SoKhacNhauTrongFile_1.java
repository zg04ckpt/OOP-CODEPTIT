
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004_SoKhacNhauTrongFile_1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(sc.hasNext()) {
            int key = sc.nextInt();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
