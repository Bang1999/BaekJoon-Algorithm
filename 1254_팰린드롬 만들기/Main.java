import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        // 문자열 S 입력
        String S = sc.nextLine();
        sc.close();

        // String Builder에 옮기기
        StringBuilder s = new StringBuilder(S);
        boolean ans = true;
        int idx = s.length();
        int add = s.length()-1;
        String left, right;

        while(ans){
        // 먼저 왼쪽 오른쪽 구분하기
            // 길이 짝수
            if(idx%2 == 0){
                idx /= 2;
                left = s.substring(0, idx);
                right = s.substring(idx, s.length());
                StringBuilder reverse = new StringBuilder(right);
                reverse.reverse();
                right = reverse.toString();

            // 길이 홀수
            }else{
                idx = idx/2 +1;
                left = s.substring(0, idx-1);
                right = s.substring(idx, s.length());
                StringBuilder reverse = new StringBuilder(right);
                reverse.reverse();
                right = reverse.toString();
            }
        
        // 왼쪽, 오른쪽 같으면 멈춤
            if(left.equals(right)){
                ans = false;
        // 같지 않을경우,
            }else{
                add--;
                s.append(S.charAt(add));
                idx = s.length();
            }            
        }

        System.out.println(s.length());
        

    }
}