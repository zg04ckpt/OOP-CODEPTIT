
package file.j07053_xetTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Contestant> contestants = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            contestants.add(new Contestant(
                    String.format("PH%02d", i),
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        for(Contestant c : contestants) {
            System.out.println(c);
        }
         
        sc.close();
    }

}
