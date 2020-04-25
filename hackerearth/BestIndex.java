//package hackerearth;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class BestIndex {
//
//    static int[] prefixSum( int [] array, int n ){
//        int [] prefSum = new int [n];
//        Arrays.fill(prefSum, 0);
//        prefSum[n-1]=array[n-1];
//        for ( int i = 0; i < n-1 ; i++){
//            prefSum[n-2-i]=prefSum[n-1-i] +array[n-2-i];
//        }
//
//        return prefSum;
//
//    }
//
//    static int[] findPos ( int n){
//        int pos[]= new int[n];
//        Arrays.fill(pos, 1);
//
//        for ( int i = 0; i < n; i++) {
//            int k = 2;
//            pos[i]=i+1;
//            while (pos[i]+ k < n) {
//                pos[i] += k;
//                k++;
//
//            }
//        }
//        for ( int k = 0; k < n ; k++){
//            pos[k]-=1;
//        }
//        return pos;
//    }
//
//    public static void main (String[] args) throws  Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        int size = Integer.parseInt(br.readLine());
//        int size = 6;
//        long [] array = Arrays.stream(br.readLine().split("\\s")).mapToLong(Long::parseLong).toArray();
////        int [] array = {-3, 2, 3, -4, 3, 1};
//        int [] prefSum = prefixSum(array, size);
//        int [] ssum = findPos(size);
//        for ( int i = 0; i < size; i++){
////            System.out.println("\nElement at index "+ i + " - " + array[i]);
//            int j = i;
//            int k = 1;
////            int ss = array[i];
//           while ( j + k < size -1 ){
//               k++;
//               j +=k;
//           }
////            System.out.println("For index i " + i + " sum adds til "+ j);
//           for ( int l = i+1; l <=j; l++){
////               System.out.println(i +" "+ ssum[i] + " " + ssum[l] );
//               ssum[i]+=ssum[l];
////               System.out.println(ssum[i]);
//           }
//        }
////        for ( int i =0 ; i < size; i++){
////            System.out.println(ssum[i]);
////        }
//
////        System.out.println(Arrays.stream(ssum).max().getAsInt());
//    }
//}
