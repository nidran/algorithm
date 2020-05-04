package hackerearth;

import java.lang.reflect.Array;
import java.util.Arrays;

// Java implementation of the above approach
class GFG
{
//    Here dp[i][j] defines the minimum value that can be obtained if the array is starting from index i and have j partition.
//
//So, the answer to the problems will be dp[0][K], array starting at 0 and having K partitions.

    // Function to divide an array into k
    // parts such that the sum of difference
    // of every element with the maximum element
    // of that part is minimum
    static int divideArray(int arr[], int n, int k)
    {
        // Dp to store the values
        int dp[][] = new int[10][10];

        int i, j;

        for(i = 0; i < 10; i++)
            for(j = 0; j < 10; j++)
                dp[i][j] = 0;

        k -= 1;

        // Fill up the dp table
        for (i = n - 1; i >= 0; i--)
        {
            for (j = 0; j <= k; j++)
            {

                // Intitilize maximum value
                dp[i][j] = Integer.MAX_VALUE;

                // Max element and the sum
                int max_ = -1, sum = 0;

                // Run a loop from i to n
                for (int l = i; l < n; l++)
                {
                    // Find the maximum number
                    // from i to l and the sum
                    // from i to l
                    max_ = Math.max(max_, arr[l]);
                    sum += arr[l];

                    // Find the sum of difference
                    // of every element with the
                    // maximum element
                    int diff = (l - i + 1) * max_ - sum;

                    // If the array can be divided
                    if (j > 0)
                        dp[i][j] = Math.min(dp[i][j], diff +
                                dp[l + 1][j - 1]);
                    else
                        dp[i][j] = diff;
                }
            }
        }

        for ( int rows[] : dp){
            System.out.println(Arrays.toString(rows));
        }
        // Returns the minimum sum
        // in K parts
        return dp[0][k];
    }

    // Driver code
    public static void main (String[] args)
    {
        int arr[] = { 2, 9, 5, 4, 8, 3, 6 };
        int n = arr.length;
        int k = 2;

        System.out.println(divideArray(arr, n, k));
    }
}

// This code is contributed by AnkitRai01

