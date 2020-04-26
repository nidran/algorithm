package backtracking;

import java.util.Arrays;

public class KnightsTour {
    static int N;

    public static void main(String[] args) {
        N = 8;
        solve(N);
    }

    private static void solve(int n) {
        int[][] board = new int[N][N];
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }
        if (knightsTourUtil(board, 0, 0, 1)) {
            for (int[] row : board) {
                System.out.println(Arrays.toString(row));

            }
        }
    }

    private static boolean knightsTourUtil(int[][] board, int x, int y, int move) {
        // maze created
        if (move == N * N) {
            return true;
        }
//        System.out.println( x +" "+ y);
        if (isSafe(x, y, board)) {
            board[x][y] = move;
//            System.out.println("safe " + x + " " + y + " " + move +" \n");
//
//            System.out.println(board[x][y]+ " "+ move);
//            for (int[] row : board) {
//                System.out.println(Arrays.toString(row));
//
//            }

            if (knightsTourUtil(board, x + 2, y + 1, move + 1)) {
//                System.out.println(" in move 1");
                return true;
            } else if (knightsTourUtil(board, x + 2, y - 1, move + 1)) {
//                System.out.println(" in move 2");
                return true;
            } else if (knightsTourUtil(board, x - 2, y - 1, move + 1)) {
//                System.out.println(" in move 3");
                return true;
            } else if (knightsTourUtil(board, x - 2, y + 1, move + 1)) {
//                System.out.println(" in move 4");
                return true;
            } else if (knightsTourUtil(board, x + 1, y - 2, move + 1)) {
//                System.out.println(" in move 5");
                return true;
            } else if (knightsTourUtil(board, x + 1, y + 2, move + 1)) {
//                System.out.println(" in move 6");
                return true;
            } else if (knightsTourUtil(board, x - 1, y - 2, move + 1)) {
//                System.out.println(" in move 7");
                return true;
            } else if (knightsTourUtil(board, x - 1, y + 2, move + 1)) {
//                System.out.println(" in move 8");
                return true;
            } else {
//                System.out.println("No sol");
                board[x][y] = 0;
                return false;
            }
        }
        return false;

    }

    private static boolean isSafe(int x, int y, int[][] board) {
        return x >= 0 && x < N && y >= 0 && y < N && board[x][y]==0;
    }
}
