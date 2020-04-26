package backtracking;

import java.util.Arrays;

public class RatMaze {
    static int N;


    public static void main(String[] args) {

        RatMaze rat = new RatMaze();
        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};

        N = maze.length;
        int[][] sol = new int[N][N];
        if (solve(maze, sol)) {
            for (int[] row : sol) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

    private static boolean solve(int[][] maze, int[][] sol) {

        for (int[] row : sol) {
            Arrays.fill(row, 0);
        }

        if (RatMazeUtil(maze, 0, 0, sol))
            return true;

        return false;
    }

    private static boolean RatMazeUtil(int[][] maze, int x, int y, int [][] sol) {
        if (x == N - 1 && y == N - 1) {
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;
            if (RatMazeUtil(maze, x + 1, y, sol))
                return true;
            else if (RatMazeUtil(maze, x, y + 1, sol))
                return true;
            else {
                sol[x][y] = 0;
                return false;
            }
        }

        return false;
    }




    private static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] != 0);
    }
}
