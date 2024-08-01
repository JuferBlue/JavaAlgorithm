package 前缀与差分;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @BelongsProject: JavaAlgorithm
 * @BelongsPackage: 前缀与差分
 * @Author: JuferBlue
 * @CreateTime: 2024-08-01  06:32
 * @Description: Acwing 795. 前缀和
 * https://www.acwing.com/problem/content/description/797/
 * @Version: 1.0
 */
public class AC795 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1;i<=n;i++){
            arr[i] = cin.nextInt();
            arr[i]+=arr[i-1];
        }
        while(m-- > 0){
            int l = cin.nextInt();
            int r = cin.nextInt();

            System.out.println(arr[r]-arr[l-1]);
        }
    }

}
