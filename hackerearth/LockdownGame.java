//package hackerearth;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class LockdownGame {
//    public static void main (String[] args){
//        FastReader s = new FastReader();
//        int n = s.nextInt();
//        String str = s.next();
////        int n = 3;
////        String str = "xyx";
//        System.out.println(findWinner(n, str));
//    }
//
//    private static long findWinner(int n, String str) {
//        int len = str.length();
//        System.out.println("Length of str " + len);
//        System.out.println("\n");
//        Queue<Integer> currPlayers = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            currPlayers.add(i);
//        }
//
//        while (currPlayers.size()!=1) {
//            for ( int i = 0; i < len; i++){
//                if(str.charAt(i)=='x')
//                {currPlayers.push(q.front());
//                    q.pop();}
//                else
//                {
//                    q.pop();
//                }
//                if(q.size()==1)
//                    break;
//            }
//
//        }
//        return currPlayers.get(0);
//    }
//
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
//}
