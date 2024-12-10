
package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J01013_TongUocSo1 {
    private static final int MAX = 2000001;
    private static ArrayList<Integer> primes;
    
    private static void init() {
        primes = new ArrayList<>();
        boolean[] isPrime = new boolean[MAX];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i <= Math.sqrt(MAX); i++) {
            if(isPrime[i]) {
                for(int j = i*i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        for(int i = 2; i < MAX; i++) {
            if(isPrime[i]) {
                primes.add(i);
            }
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while (t-- > 0) {            
            int n = sc.nextInt();
            for(Integer e : primes) {
                if(e * e > n) {
                    break;
                }
                while(n % e == 0) {
                    sum += e;
                    n /= e;
                }
            }
            if(n > 1) {
                sum += n;
            }
        }
        System.out.println(sum);
    }

}
