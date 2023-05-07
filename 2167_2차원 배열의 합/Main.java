import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int L = sc.nextInt();

        int[] ans = new int[L];
        Arrays.fill(ans, 0);

        int[] temp = new int[4];

        for(int A=0;A<L;A++){
            for(int k=0;k<4;k++){
                temp[k]= sc.nextInt()-1;
            }

            for(int i=temp[0];i<=temp[2];i++){
                for(int j=temp[1];j<=temp[3];j++){
                    ans[A] += arr[i][j];
                }
            }


        }
        sc.close();

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    
    }
}
