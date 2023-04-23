import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        int K = sc.nextInt();

        sc.close();

        LinkedList<Integer> arr = new LinkedList<Integer>();
        int[] ans = new int[N];

        for(int i=0;i<N;i++){
            arr.add(i+1);
        }
        
        int idx =0;

        
        for(int i=0;i<N;i++){
            idx =(idx + (K-1))%arr.size();
            ans[i] = arr.get(idx);
            arr.remove(idx);
        }


        System.out.print("<");
        for(int i=0;i<N-1;i++){
            System.out.print(ans[i] + ", ");
        }
        System.out.print(ans[ans.length-1]);
        System.out.print(">");
    }
}
