//package az;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//import java.util.StringTokenizer;
//
//public class PostFix {
//    static class FastReader {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public FastReader() {
//            br = new BufferedReader(new
//                    InputStreamReader(System.in));
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
//        String nextLine() {
//            String str = "";
//            try {
//                str = br.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return str;
//        }
//    }
//
//    public static void main(String[] args){
//        FastReader fr = new FastReader();
//        int tc = fr.nextInt();
//        for ( tc -->0){
//            String exp = new String();
//            char[] ch=exp.toCharArray();
//            exp = fr.nextLine();
//            Stack<Integer> stack = new Stack<>();
//            int l = exp.length();
//            for ( int i = 0; i< l; i++){
//                if (ch[i] >= '0' && ch[i] <= '9'){
//
//                }
//            }
//        }
//    }
//}
