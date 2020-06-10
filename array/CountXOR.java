package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Given an array A[] of size N. Find the number of pairs (i, j) such that  A_i XOR  A_j = 0, and 1 <= i < j <= N.
 */
public class CountXOR {
    public static void  main (String[] args) {
        FastReader fr = new FastReader();
        int tc = fr.nextInt();
        while (tc-- > 0) {
            int n = fr.nextInt();
            int a[] = new int[n];
            for ( int i = 0; i < n ; i++) {
                a[i] = fr.nextInt();
            }
            int x =0, k=0, r;
            for ( int i =0; i < n ; i++){
                if (i!=x){
                    r = a[i]^a[x];
                    if ( r==0)
                    {
                     k++;
                    }
                    if ( i== n-1){
                        x++;
                        i=x;
                    }
                }
            }
            System.out.println(k);


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
