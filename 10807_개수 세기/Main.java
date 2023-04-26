import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        sc.close();
        int cnt=0;
        for(int i=0;i<N;i++){
            if(arr[i] == v){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
