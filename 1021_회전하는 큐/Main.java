import java.util.Scanner;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        
        int count=0;                                                // 연산 횟수

        int N = sc.nextInt();                                       // N값 입력 받기
        LinkedList<Integer> queue = new LinkedList<Integer>();                             // N크기의 Queue 생성
        for(int i=0; i<N;i++){
            queue.add(i+1);
        }
        

        int M = sc.nextInt();                                       // 뽑으려는 수의 개수
        int[] GET_M = new int[M];
        // 어느 값을 뽑을지 입력 받기
        for(int i=0;i<M;i++){
            GET_M[i] = sc.nextInt();
        }
        sc.close();

        // 찾을 값 차
        for(int i=0;i<M;i++){

            int val_f = GET_M[i];
            int idx = queue.indexOf(val_f)+1;
            // queue의 중앙값
            float mid_idx = (float)queue.size()/2;
            int k;
            if(mid_idx % 1 != 0){
                k = (int)mid_idx + 1;    
            }else{
                k = (int)mid_idx;
            }
            
            if(k >= idx){
                // 왼쪽부터 연산
                int val_p = queue.get(0);
                // 왼쪽 값이 찾고자하는 값이 아닌경우 재정렬 연산
                while(val_f != val_p){
                    queue.removeFirst();
                    queue.addLast(val_p);
                    val_p = queue.get(0);
                    count++;
                }
                queue.removeFirst();
            } else{
                // 오른쪽부터 연산
                int val_p = queue.get(queue.size()-1);
                while(val_f != val_p){
                    queue.removeLast();
                    queue.addFirst(val_p);
                    val_p = queue.get(queue.size()-1);
                    count++;
                }
                queue.removeLast();
                count++;
            }   
        }
        System.out.println(count);
    }
    
}
