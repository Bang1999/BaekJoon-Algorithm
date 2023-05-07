import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        int[] cur = {0, 0};

        System.out.println(move(board, cur));
    }

    public static int move(int[][] board, int[] cur) {
        int n = board.length;

        // Base case: 목적지 도착
        if (cur[0] == n - 1 && cur[1] == n - 1) {
            return 1;
        }

        // 현재 위치에서 이동 가능한 오른쪽, 아래쪽 좌표 계산
        int[] right = {cur[0], cur[1] + board[cur[0]][cur[1]]};
        int[] down = {cur[0] + board[cur[0]][cur[1]], cur[1]};

        int count = 0;

        // 오른쪽 좌표가 범위 내에 있으면 오른쪽으로 이동한 경우 계산
        if (right[0] < n && right[1] < n) {
            count += move(board, right);
        }

        // 아래쪽 좌표가 범위 내에 있으면 아래쪽으로 이동한 경우 계산
        if (down[0] < n && down[1] < n) {
            count += move(board, down);
        }

        return count;
    }
}
