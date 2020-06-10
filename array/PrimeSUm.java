//import java.util.ArrayList;
//
//public class Solution {
//
//    public ArrayList<Integer> primesum(int n) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        boolean isPrime[]=new boolean[n + 1];
//        isPrime[0] = isPrime[1] = false;
//        for (int i = 2; i <= n; i++)
//            isPrime[i] = true;
//
//        for (int p = 2; p * p <= n; p++)
//        {
//            if (isPrime[p] == true)
//            {
//                for (int i = p * p; i <= n; i += p)
//                    isPrime[i] = false;
//
//        }
//
//        for (int i = 0; i < n; i++)
//        {
//            if (isPrime[i] && isPrime[n - i])
//            {
//                numbers.add(i);
//                numbers.append(n-i);
//
//            }
//        }
//        return numbers;
//
//    }
//}
//
//
//
//
