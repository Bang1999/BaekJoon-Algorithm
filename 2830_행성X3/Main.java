/*
 * 메모리 초과!!!!!시부랄
 */
import java.util.*;
import java.lang.Math;

public class Main {
    public static int get_val(String a, String b){
        
        // String temp;
        // int l;
        String ans = "";
        if(a.length() > b.length()){
            // 길이 a > b인 경우
            int l = a.length()-b.length();
            String temp = "0".repeat(l);
            temp += b;
            for(int m=0;m<temp.length();m++){
                if(temp.charAt(m) == a.charAt(m)){
                    ans += "0";
                }else{
                    ans += "1";
                }
            }
        }
        else if(a.length() < b.length()){
            // 길이 b > a인 경우 
            int l = b.length() - a.length();
            String temp = "0".repeat(l);
            temp += a;
            for(int n=0; n<temp.length();n++){
                if(temp.charAt(n) == b.charAt(n)){
                    ans += "0";
                }else{
                    ans += "1";
                }
            }
        }else{
            // 길이 같은 경우
            for(int j=0; j<a.length();j++){
                if(a.charAt(j) == b.charAt(j)){
                    ans += "0";
                }else{
                    ans += "1";
                }
            }
        }
        int k;
        int get = 0;
        for(int i=0;i<ans.length();i++){
            int ll = ans.length()-i-1;
            int v = (int)Math.pow(2, ll);
            if(ans.charAt(i) == '0'){
                k=0;
            }else{
                k=1;
            }
            get += v*k;
        }
        return get;
    }
    public static int facto(int n){
        n *= n-1;
        return n;
    }
    public static void main(String[] args){
        
        // MyCode
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int N = sc.nextInt();

        int[] arr = new int[N];
        String[] arr_2 = new String[N];
        
        // arr값을 2진수로 전환 후 arr_2에 넣기
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            arr_2[i] = Integer.toBinaryString(arr[i]);
        }
        sc.close();
        

        for(int i=0;i<arr_2.length-1;i++){
            for(int j=i+1;j<arr_2.length;j++){
                int temp = get_val(arr_2[i], arr_2[j]);
                answer += temp;
            }
        }
        

        System.out.println(answer);
        // Runtime runtime = Runtime.getRuntime();
        // long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        // System.out.println("Used memory: " + usedMemory + " bytes");

    }
}