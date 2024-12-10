
package core;

import java.util.Scanner;

public class J01005_ChiaTamGiac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            double k = (0.5 * 1 * H) / N;
            for(int i = 1; i < N; i++) {
                System.out.print(String.format("%.6f ", Math.sqrt(2*k*i*H)));
            }
            System.out.println();
        }
    }

}

// B, H -> B = 1

// b, h -> h/H = b/B -> (h/H = b)
// s = 0.5 * h/H * h -> 2*s*H = h*h -> h = sqrt(2*s*H)
// h = sqrt(2*k*i*H)
