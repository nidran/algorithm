//package hackerearth;
//
//import java.io.*;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class ArrayInsert {
//    public static void main(String[] args){
//    FastScanner sc = new FastScanner();
//    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
//
//
//        long n = sc.nextLong();
//        long q = sc.nextLong();
//        long[] array = new long[];
//
//
//        out.close();
//}
//
//
//    // read input faster
//    public static class FastScanner {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastScanner() {
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//        String next() {
//            while (st == null || !st.hasMoreElements()) {
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//
//        long nextLong() {
//            return Long.parseLong(next());
//        }
//
//        double nextDouble() {
//            return Double.parseDouble(next());
//        }
//
//        String nextLine(){
//            String str = "";
//            try {
//                str = br.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return str;
//        }
//
//    }
//}
