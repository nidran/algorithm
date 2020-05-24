package hackerearth;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CostOfBalloons {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int tc = s.nextInt();
        while (tc-- > 0 ){
        int g = s.nextInt();
        int p = s.nextInt();
        int n = s.nextInt();
        int q1 =0, q2 =0;

        while (n-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a==1)
                q1+=1;
            if (b==1)
                q2+=1;
        }
        System.out.println(Math.min((q1*g + q2*p), (q1*p + q2*g)));
    }}
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
