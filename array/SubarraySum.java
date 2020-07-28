package array;

import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){

            int n = s.nextInt();
            int eSum= s.nextInt();
            int arr[] = new int[n];
            for ( int i =0; i < n; i++){
                arr[i]=s.nextInt();
            }
            findSubarraySumMethod2(eSum, arr,n);
    }
}

    private static void findSubarraySumMethod1(int eSum, int[] arr, int n) {
        // find all subarrays see if something matches
        int cSum =0;
        for ( int i = 0; i< n; i++){
          cSum= arr[i];
          for ( int j =i+1; j<n; j++){
              if ( cSum == eSum){
                  System.out.println(i+1 +" "+ j);
                  return ;
              }
              else if ( cSum> eSum){
                  break;
              }
              cSum+= arr[j];
          }
        }
        System.out.println("-1");
        return;
    }
    private static void findSubarraySumMethod2(int eSum, int[] arr, int n) {
        // If curr_sum exceeds the sum,
        // then remove the starting elements
        int start =0, cSum=arr[0];
        for ( int i = 1; i<=n; i++) {
            while (cSum > eSum && start < i - 1) {
                cSum -= arr[start];
                start++;
            }
            if (cSum == eSum){
                System.out.println(start+1 + " "+ i);
                return;
        }
            cSum+=arr[i];

        }
        System.out.println("-1");
        return;
    }
    }
