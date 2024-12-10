
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J07040_LietKeTheoThuTuXuatHien {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> li = (ArrayList<String>) ois.readObject();
        HashSet<String> set = new HashSet<>();
        for(String e : li) {
            for(String w : e.trim().split("\\s+")) {
                set.add(w.toLowerCase());
            }
        }
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> res = new LinkedHashSet<>();
        while(sc.hasNext()) {
            String token = sc.next().toLowerCase();
            if(set.contains(token)) {
                res.add(token);
            }
        }
        
        for(String e : res) {
            System.out.println(e);
        }
        
        ois.close();
    }

}
