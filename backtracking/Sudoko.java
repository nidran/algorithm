package backtracking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sudoko {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args){
//        Sudoko.FastReader s = new Sudoko.FastReader();
//        int tc = s.nextInt();
//        while ( tc -- > 0){
//
//        }
        int[][] board = new int[][]
                {
                        {3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0}
                };
        int N = board.length;

        if (solveSudoku(board, N))
        {
            for ( int[] row : board)
            {
                System.out.println(Arrays.toString(row));
            }
        }


    }

    private static boolean solveSudoku(int[][] board, int n) {
        int row= -1;
        int col =-1;
        boolean isFull = true;
        for ( int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isFull = false;
                    break;

                }
            }
        }
        if(isFull)
            return true;

        for ( int i =1; i <=n; i++)
        {
            if (isSafe(board, row, col, i, n))
            {
                board[row][col]=i;
                if (solveSudoku(board, n))
                    return true;
                else
                {
                    board[row][col]=0;
                }
            }

        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num, int n) {
        // check row
        for ( int i =0; i <n ; i++){
            if ( board[i][col]==num)
                return false;

        }
        for ( int i =0; i <n ; i++){
            if ( board[row][i]==num)
                return false;

        }
        // unique number (box-clash)
        int sqrt = (int) Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart;
             r < boxRowStart + sqrt; r++)
        {
            for (int d = boxColStart;
                 d < boxColStart + sqrt; d++)
            {
                if (board[r][d] == num)
                {
                    return false;
                }
            }
        }
        return true;
    }


}
