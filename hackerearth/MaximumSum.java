package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class MaximumSum {
    public static void main(String[] args) {
        MaximumSum.FastReader fr = new FastReader();
        int tc = fr.nextInt();
        while (tc-- > 0) {
            int n = fr.nextInt();
            int k = fr.nextInt();
            Integer[] arr = new Integer[n + 1];
            arr[0] = 0;
            for (int i = 1; i <=n; i++) {
                arr[i] = fr.nextInt();
            }
            Integer count[] = new Integer[n + 1];
            Arrays.fill(count, 0);
            System.out.println(Arrays.toString(count));

            int aliceSum = 0;
            for (int i = 0; i < k; i++) {
//                System.out.println(i);
                int start = fr.nextInt();
                int end = fr.nextInt();
                for (int j = start; j <= end; j++) {
                    System.out.println(j);
                    count[j] += 1;
                    aliceSum += arr[j];
                }
                System.out.println(aliceSum);
            }
            System.out.println(Arrays.toString(count));
            System.out.println(Arrays.toString(arr));
//            System.out.println();
            Arrays.sort(count, Collections.reverseOrder());
            Arrays.sort(arr, Collections.reverseOrder());
            int bobSum = 0;
            for (int l = 0; l <n; l++) {

                bobSum += arr[l] * count[l];
                System.out.println(bobSum);
            }
            System.out.println(bobSum);
            System.out.println(aliceSum);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(count));
            System.out.println(bobSum - aliceSum);
        }
    }


//            System.out.println(arr[0]);
//            System.out.println(subarray[0][0]);

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


    }
}
