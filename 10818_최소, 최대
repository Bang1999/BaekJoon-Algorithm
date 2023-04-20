import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N값 입력받아
        int N = sc.nextInt();
        int[] array = new int[N];

        // 배열 입력받아
        for(int i=0;i<N;i++){
            array[i] = sc.nextInt();
        }

        sc.close();

        // 최소, 최대 변수
        int min=array[0];
        int max=array[0];

        // 한바퀴 돌면서 최소 최대 구하기
        for(int i=0; i<array.length;i++){
            int val = array[i];

            if(val < min){
                min = val;
            }
            if(max < val){
                max = val;
            }
        }
        
        System.out.printf("%d %d", min, max);
    }
}
