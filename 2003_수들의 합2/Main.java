import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }


        sc.close();


        // analysis

        int ans=0;
        int sum=0;

        for(int i=0;i<N;i++){
            int k=i;
            while(sum<M){
                if(k>=N){
                    break;
                }
                sum += arr[k];
                k++;
            }
            if(sum == M){
                ans++;
            }
            sum=0;
        }
        
        System.out.println(ans);



    }
}
