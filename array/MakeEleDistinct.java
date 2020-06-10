//package array;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashSet;
//import java.util.StringTokenizer;
//
//public class MakeEleDistinct {
//    public static void main (String[] args){
//        CountXOR.FastReader fr = new CountXOR.FastReader();
//        int tc = fr.nextInt();
//        while (tc-- > 0) {
//            int n = fr.nextInt();
//            int a[] = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                a[i] = fr.nextInt();
//            }
//            int f = a[0];
//            int l = a[n-1];
//            int dup=0;
//            HashSet<Integer> eleList = new HashSet<>();
//            for ( int i = f; i<=l; i++){
//                eleList.add(i);
//            }
//            // find duplicate element
//            for (int i = 0; i < n; i++) {
//               if (eleList.contains(a[i]))
//                   eleList.remove(a[i]);
//               else {
//                   dup = i;
//                   break;
//            }
//
//        }
//
//
//        }
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
//}
