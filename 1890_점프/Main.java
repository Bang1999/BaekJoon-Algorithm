import java.util.*;

public class Main {

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N][N];
        int[] cur = {0, 0};      // x좌표 , y좌표, cnt

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board[i][j] = sc.nextInt();
            }
        }
        sc.close();        

        // start
        int[] ans = move(board, cur);
        System.out.println(ans);
        
        

    }



    public static int[] move(int[][] board, int[] cur){
        // 종착지인 경우 ++
        if(board[cur[0]][cur[1]] == 0){
            cur[2]++;
            return cur;
        }

        // 오른쪽 이동
        int[] right = move_right(board, cur);
        if(right[0] != -1 && right[1] != -1 && right[2] != -1){
            right = move(board, right);
        }
        
        
        

        // 아래로 이동
        int[] down = move_down(board, cur);
        if(down[0] != -1 && down[1] != -1 && down[2] != -1){
            down = move(board, down);
        }

        // 오른쪽과 아래로 이동했을 때 방문 가능한 칸이 없는 경우
        if(right == null && down == null){
            return null;
        }

        // 카운트 값을 계산하여 반환
        if(right != null){
            cur[2] += right[2];
        }
        if(down != null){
            cur[2] += down[2];
        }
        return cur;
        
    }

    // 오른쪽 이동
    public static int[] move_right(int[][] board, int[] cur_r){
        int[] next = {cur_r[0], cur_r[1] + board[cur_r[0]][cur_r[1]], cur_r[2]};
        // // 오른쪽으로 이동
        // cur_r[1] = cur_r[1] + board[cur_r[0]][cur_r[1]];
        // 이동했는데 범위 밖인경우
        if(next[1] >=board.length){
            return new int[]{-1, -1, -1};
        }
        return next;
    }

    // 아래로 이동
    public static int[] move_down(int[][] board, int[] cur_d){
        int[] next = {cur_d[0] + board[cur_d[0]][cur_d[1]], cur_d[1], cur_d[2]};
        // // 아래로 이동
        // cur_d[0] = cur_d[0] + board[cur_d[0]][cur_d[1]];
        // 이동했는데 범위 밖인경우
        if(next[0] >=board.length){
            return new int[]{-1, -1, -1};
        }
        return next;
    }
}
