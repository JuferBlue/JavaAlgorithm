package 前缀与差分;

import java.util.Scanner;

/**
 * @BelongsProject: JavaAlgorithm
 * @BelongsPackage: 前缀与差分
 * @Author: JuferBlue
 * @CreateTime: 2024-08-01  07:26
 * @Description: Acwing 797. 差分
 * https://www.acwing.com/problem/content/799/
 * @Version: 1.0
 */
public class AC797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[100010];
        int[] s = new int[100010];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            s[i] = a[i]-a[i-1];
        }
        for(int i = 1; i <= m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            s[l]+=c;
            s[r+1]-=c;
        }
        for(int i = 1; i <= n; i++){
            s[i]+=s[i-1];
            System.out.print(s[i]+" ");
        }
    }
}
