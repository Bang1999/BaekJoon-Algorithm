// import java.util.*;

// public class main {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();
//         int K = sc.nextInt();

//         int[] coin = new int[N];

//         for(int i = 0;i<coin.length;i++){
//             coin[i] = sc.nextInt();
//         }
        
//         sc.close();

//         int cnt=0;
//         int num = coin.length-1;
//         while(K != 0){
//             for(int i=num;i>0;i--){
//                 if(K%coin[i] != K){
//                     K -= coin[i];
//                     cnt++;
//                     num = i;
//                     break;
//                 }
//             }
//         }

//         System.out.println(cnt);
//     }
// }




import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전 종류 개수
        int k = sc.nextInt(); // 만들고자 하는 금액

        int[] coin = new int[n];
        int[] dp = new int[k + 1];

        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        
        sc.close();

        // dp 초기화
        for (int i = 1; i <= k; i++) {
            dp[i] = 100000001; 
        }

        // 동적 프로그래밍
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }

        // 출력
        if (dp[k] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(dp[k]);
        }
    }
}