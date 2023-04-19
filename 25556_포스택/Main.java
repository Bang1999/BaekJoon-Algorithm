import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();

        // N값 입력 받기
        int N = scanner.nextInt();
        int[] array = new int[N];

        // 값을 배열 A에 넣기
        for(int i=0;i<N;i++){
            array[i] = scanner.nextInt();
        }

        scanner.close();

        // 배열 A에 있는 값을 스택에 넣기
        for(int i=0;i<N;i++){
            if(stack1.empty() || stack1.peek() < array[i]){
                stack1.push(array[i]);
            }else if(stack2.empty() || stack2.peek() < array[i]){
                stack2.push(array[i]);
            }else if(stack3.empty() || stack3.peek() < array[i]){
                stack3.push(array[i]);
            }else if(stack4.empty() || stack4.peek() < array[i]){
                stack4.push(array[i]);
            }else{
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
