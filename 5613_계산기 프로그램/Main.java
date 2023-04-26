import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        String input = "";
        int key = 0;
        int answer = sc.nextInt();
        
        while(!(input.equals("="))){
            input = sc.next();
            switch(input){
                case "+":
                    key = 1;
                    break;
                case "-":
                    key = 2;
                    break;
                case "*":
                    key = 3;
                    break;
                case "/":
                    key = 4;
                    break;
                default:
                    if(input.equals("=")){
                        //s 마무리
                        System.out.println(answer);
                        break;
                    }else{
                        // 숫자
                        if(key == 1){
                            int val = Integer.parseInt(input);
                            answer += val;
                        }else if(key == 2){
                            int val = Integer.parseInt(input);
                            answer -= val;
                        }else if(key == 3){
                            int val = Integer.parseInt(input);
                            answer *= val;
                        }else{
                            int val = Integer.parseInt(input);
                            answer /= val;
                        }
                    }
            }
        }

    }
}
