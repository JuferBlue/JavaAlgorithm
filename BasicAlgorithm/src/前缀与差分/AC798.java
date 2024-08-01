package 前缀与差分;

import java.util.Scanner;

/**
 * @BelongsProject: JavaAlgorithm
 * @BelongsPackage: 前缀与差分
 * @Author: JuferBlue
 * @CreateTime: 2024-08-01  08:12
 * @Description: Acwing 79.差分矩阵
 * https://www.acwing.com/problem/content/800/
 * @Version: 1.0
 */
public class AC798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] a = new int[1010][1010];
        int[][] s = new int[1010][1010];
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++){
                a[i][j] = sc.nextInt();
                s[i][j] = a[i][j] - a[i-1][j]-a[i][j-1]+a[i-1][j-1];
            }
        }
        while(q-->0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int c = sc.nextInt();
            s[x1][y1] += c;
            s[x2+1][y2+1] += c;
            s[x1][y2+1]-=c;
            s[x2+1][y1]-=c;
        }
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++){
                s[i][j] = s[i][j]-s[i-1][j-1]+s[i][j-1]+s[i-1][j];
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }


    }
}
