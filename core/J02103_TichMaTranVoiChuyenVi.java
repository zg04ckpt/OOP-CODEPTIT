
package core;

import java.util.Scanner;

public class J02103_TichMaTranVoiChuyenVi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int h = 1; h <= t; h++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            
            int[][] ans = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    ans[i][j] = 0;
                    for(int k = 0; k < m; k++) {
                        ans[i][j] += a[i][k] * a[j][k];
                    }
                }
            }
            
            System.out.println("Test " + h + ":");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
