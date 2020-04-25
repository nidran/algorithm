package dp;
// Java program to solve Gold Mine problem
import java.lang.reflect.Array;
import java.util.Arrays;

class goldmine {

    static final int MAX = 100;

    // Returns maximum amount of gold that
    // can be collected when journey started
    // from first column and moves allowed
    // are right, right-up and right-down
    static int getMaxGold(int gold[][],
                          int m, int n)
    {


        int goldTable[][] = new int[m][n];

        for(int[] rows:goldTable)
            Arrays.fill(rows, 0);

        for ( int col = n-1; col >=0 ; col --){
            for ( int row = 0; row <=n-1; row++){

                int right = (col == n-1) ? 0
                        : goldTable[row][col+1];
                int right_up = (row == 0 ||
                        col == n-1) ? 0 :
                        goldTable[row-1][col+1];

                int right_down = (row == m-1
                        || col == n-1) ? 0 :
                        goldTable[row+1][col+1];

                goldTable[row][col] = gold[row][col]
                        + Math.max(right, Math.max(right_up,
                        right_down));

            }
        }


      return  goldTable[0][0];

    }

    //driver code
    public static void main(String arg[])
    {
        int gold[][]= { {1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2} };

        int m = 4, n = 4;

        System.out.print(getMaxGold(gold, m, n));
    }
}

