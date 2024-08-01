package 位运算;

import java.util.Scanner;

/**
 * @BelongsProject: JavaAlgorithm
 * @BelongsPackage: 位运算
 * @Author: JuferBlue
 * @CreateTime: 2024-08-01  08:57
 * @Description: Acwing .801 二进制中1的个数
 * https://www.acwing.com/problem/content/803/
 * @Version: 1.0
 */
public class AC801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int cnt = 0;
            while(x > 0){
                x-=lobit(x);
                cnt++;
            }
            System.out.print(cnt+" ");
        }
    }

    public static int lobit(int x) {
        return x&-x;
    }
}
