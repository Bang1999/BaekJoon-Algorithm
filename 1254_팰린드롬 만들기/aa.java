import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class aa {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        // 문자열 S 입력
        String S = sc.nextLine();
        sc.close();

        
        // String Builder에 옮기기
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        int cnt=S.length()/2;
        String temp = "";
        String val = "";
        for(int i =0;i<S.length()/2;i++){
            // 가운데 안넣고
            left.delete(0, left.length());
            right.delete(0, right.length());
            temp = S.substring(S.length()-cnt, S.length());
            right.append(temp);
            temp = S.substring(S.length()-2*cnt, S.length()-cnt);
            left.append(temp);
            System.out.println("가x");
            System.out.println("왼 : " + left);
            System.out.println("오 : " + right);
            if(left.toString().equals(right.reverse().toString())){
                val = S.substring(0, S.length()-cnt*2);
                left.delete(0, left.length());
                left.append(val);
                S += left.reverse().toString();
                break;
            }

            // 가운데 한개 넣어서
            if(S.length()%2 == 0){
                left.delete(0, left.length());
                right.delete(0, right.length());
                temp = S.substring(S.length()-cnt+1, S.length());
                right.append(temp);
                temp = S.substring(S.length()-2*cnt, S.length()-cnt-1);
                left.append(temp);
            }else{
                left.delete(0, left.length());
                right.delete(0, right.length());
                temp = S.substring(S.length()-cnt, S.length());
                right.append(temp);
                temp = S.substring(S.length()-2*cnt-1, S.length()-cnt-1);
                left.append(temp);
            }
            if(temp==""){
                // left = S.subString(0, S.length()-2);
                left.append(S.substring(0, S.length()-1));
                S += left.reverse();
                break;
            }
            System.out.println("가0");
            System.out.println("왼 : " + left);
            System.out.println("오 : " + right);
            if(left.toString().equals(right.reverse().toString())){
                val = S.substring(0, S.length()-cnt*2-1);
                left.delete(0, left.length());
                left.append(val);
                S += left.reverse().toString();
                break;
            }

            cnt--;

        }

        


        System.out.println(S);
        System.out.println(S.length());



    }
}
