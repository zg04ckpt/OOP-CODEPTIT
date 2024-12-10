
package file.j07050_sapXepMatHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            items.add(new Item(
                    String.format("MH%02d", i),
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        Collections.sort(items);
        
        for(Item i : items) {
            System.out.println(i);
        }
    }

}
