package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 1
 * 3 2 2
 * 2 1 2
 * 1 3
 * 2 4
 * 3 5
 */

public class PaintingBuildings {
    public static final long MAX_VALUE = 9223372036854775807L;
    static int n;
    static int m;
    static int k;
    static int tc;
    static long[][] idx;
    static long[][] m1;
    static long[][] m2;

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        tc = fr.nextInt();
        while (tc-- > 0) {
            n = fr.nextInt();
            m = fr.nextInt();
            k = fr.nextInt();
            int i = 0, j = 0;

            int[] painted = new int[n + 1];
            for (i = 1; i <= n; i++) {
                painted[i] = fr.nextInt();
            }

            long[][] costMatrixMatrix = new long[n + 1][m + 1];

            for (i = 1; i < n + 1; i++) {
                for (j = 1; j < m + 1; j++) {
                    costMatrixMatrix[i][j] = fr.nextlong();
                }
            }

            checkKSpeciality(painted, costMatrixMatrix);
        }


    }

    private static void checkKSpeciality(int[] painted, long[][] costMatrix) {
        idx = new long[n + 1][n + 1];
        m1 = new long[n + 1][n + 1];
        m2 = new long[n + 1][n + 1];

        long[][][] dp = new long[n + 1][n + 1][n + 1];
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= k; j++)
            {
                m1[i][j] = MAX_VALUE;
                m2[i][j] = MAX_VALUE;
                idx[i][j] = -1;
                for(int a = 0; a <= m; a++)
                {
                    dp[i][j][a] = MAX_VALUE;
                }
            }
        }
        
        if(painted[1] == 0)
        {
            for(int i = 1; i <= m; i++)
            {
                dp[1][1][i] = costMatrix[1][i];
                if(dp[1][1][i] <= m1[1][1])
                {
                    if(dp[1][1][i] == m1[1][1])
                    {
                        idx[1][1] = -2;
                    }
                    else
                    {
                        idx[1][1] =i;
                    }
                    m2[1][1] = m1[1][1];
                    m1[1][1] = dp[1][1][i];
                }
                else if(dp[1][1][i] <= m2[1][1])
                {
                    m2[1][1] = dp[1][1][i];
                }
            }
        }
        else
        {
            dp[1][1][painted[1]] = 0;
            m1[1][1] = 0;
            idx[1][1] = painted[1];
        }
        for(int i = 2; i <= n; i++)
        {
            for(int j = 1; j <= k; j++)
            {
                if(painted[i] == 0)
                {
                    for(int a = 1; a <= m; a++)
                    {
                        dp[i][j][a] = Math.min(dp[i][j][a], dp[i-1][j][a] + costMatrix[i][a]);
                        long tmp = MAX_VALUE;
                        if(a == idx[i-1][j-1])
                        {
                            tmp = m2[i-1][j-1];
                        }
                        else
                        {
                            tmp = m1[i-1][j-1];
                        }
                        dp[i][j][a] = Math.min(dp[i][j][a], tmp + costMatrix[i][a]);
                    }
                }
                else
                {
                    dp[i][j][painted[i]] = Math.min(dp[i][j][painted[i]], dp[i-1][j][painted[i]]);
                    for(int b = 1; b <= m; b++)
                    {
                        if(b != painted[i]) dp[i][j][painted[i]] = Math.min(dp[i][j][painted[i]], dp[i-1][j-1][b]);
                    }
                    //cout << i << ' ' << j << ' ' << painted[i] << ' ' << dp[i][j][painted[i]] << '\n';
                }
                for(int a = 1; a <= m; a++)
                {
                    if(dp[i][j][a] <= m1[i][j])
                    {
                        if(dp[i][j][a] == m1[i][j])
                        {
                            idx[i][j] = -2;
                        }
                        else
                        {
                            idx[i][j] = a;
                        }
                        m2[i][j] = m1[i][j];
                        m1[i][j] = dp[i][j][a];
                    }
                    else if(dp[i][j][a] <= m2[i][j])
                    {
                        m2[i][j] = dp[i][j][a];
                    }
                }
            }
        }
        long ans = MAX_VALUE;
        for(int i = 1; i <= m; i++)
        {
            ans = Math.min(ans, dp[n][k][i]);
        }
        if(ans >= MAX_VALUE) ans = -1;

        System.out.println(ans);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null|| !st.hasMoreElements()) {
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

        long nextlong() {
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
}

