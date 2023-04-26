import java.util.*;

public class Main {
    public static void main(String[] args){
        

        // MyCode    
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextLine();
        }
        sc.close();

        int l_cnt=0, r_cnt=0;

        String[] ans = new String[N];

        for(int i=0;i<N;i++){
            char[] val = arr[i].toCharArray();
            for(int j=0;j<val.length;j++){
                if(val[j]=='('){
                    l_cnt++;
                }else{
                    r_cnt++;
                }
                int total = l_cnt - r_cnt;
                if(total <0){
                    break;
                }
            }
            if(l_cnt==r_cnt){
                ans[i] = "YES";
            }else{
                ans[i] = "NO";
            }
            l_cnt=0;
            r_cnt=0;
        }

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}


