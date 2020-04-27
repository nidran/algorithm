package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ArrayIntersection {
    public static void main(String[] args) {

        ArrayIntersection.FastReader s = new ArrayIntersection.FastReader();
        int tc = s.nextInt();

        while (tc-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            HashSet<Integer> nySet = new HashSet<>();
            int count = 0;
            for (int i = 0; i < n; i++) {

                nySet.add(s.nextInt());
            }
            HashSet<Integer> mySet = new HashSet<>();
            for (int i = 0; i < m; i++) {
                int temp = s.nextInt();
                if (nySet.contains(temp))
                    mySet.add(temp);

            }

            System.out.println(mySet.size());
        }


    }


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
}
