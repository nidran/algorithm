/* package codechef; // don't place package name! */


import java.io.*;
import java.util.StringTokenizer;

/* Name of the class has to be "Main" only if the class is public. */
//class Codechef
/**{
    public static void main (String[] args) throws java.lang.Exception
    {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int T=sc.nextInt();
        while(T-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            if(a<=b)
                out.println(b/a);
            else
                out.println(a/b);
        }

        out.close();
    }

    //-----------MyScanner class for faster input----------
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}

 **/