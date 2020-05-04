package hackerearth;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * #
 *
 * @author pttrung
 */

/** 3 2 2
 2 0 0
 1 3
 2 4
 3 5
 */
public class paintingBuilding {


    static long[][][] dp;
    public static void main(String[] args) {

        PrintWriter out = new PrintWriter(System.out);
        FastReader in = new FastReader();
        int tc = in.nextInt();
        while (tc-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = in.nextInt();
            }
            long[][] map = new long[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = in.nextInt();
                }
            }
            dp = new long[n][m + 2][k + 1];
            for (long[][] a : dp) {
                for (long[] b : a) {
                    Arrays.fill(b, -2);
                }
            }
            out.println(cal(0, 0, 0, k, data, map));
            out.close();
        }
    }
    static long cal(int index, int last, int cur, int k, int[] data, long[][] map) {
//        System.out.println("Index " + index + " "+ "Last " + last + " "+ "Cur "+ cur +" "+ "K" + k);
//        System.out.println(Arrays.toString(data));
//        for (long[][] a : dp) {
//            for (long[] b : a) {
//                System.out.println(Arrays.toString(b));
//            }
//            System.out.println("\n");
//        }
//        System.out.println("--------------------");
        if (cur > k) {
            return -1;
        }
        if (index == data.length) {
            if (cur == k) {
                return 0;
            }
            return -1;
        }
        if (dp[index][last][cur] != -2) {
            return dp[index][last][cur];
        }
        long result = -1;
        System.out.println(result);
        if (data[index] != 0) {
            if (last != data[index]) {
                result = cal(index + 1, data[index], cur + 1, k, data, map);
            } else {
                result = cal(index + 1, data[index], cur, k, data, map);
            }
        } else {
            for (int i = 0; i < map[index].length; i++) {
                long v = cal(index + 1, i + 1, cur + (last == (i + 1) ? 0 : 1), k, data, map);
                if (v != -1 && (result == -1 || result > v + map[index][i])) {
                    result = v + map[index][i];
                }
            }
        }
        return dp[index][last][cur] = result;
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
