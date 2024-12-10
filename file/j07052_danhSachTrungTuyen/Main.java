
package file.j07052_danhSachTrungTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Contestant> contestants = new ArrayList<>();
        while(n-- > 0) {
            contestants.add(new Contestant(
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
        }
        
        Collections.sort(contestants);
        
        int amount = sc.nextInt();
        double standard = contestants.get(amount-1).getS();
        for(int i = 0; i < contestants.size(); i++) {
            if(contestants.get(i).getS() >= standard) {
                contestants.get(i).setStatus("TRUNG TUYEN");
            } else {
                contestants.get(i).setStatus("TRUOT");
            }
        }
        
        System.out.println(String.format("%.1f", standard));
        for(Contestant c : contestants) {
            System.out.println(c);
        }
    }

}
