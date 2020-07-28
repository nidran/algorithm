package array;/*package whatever //do not write package name here */

import java.util.Scanner;

public class MissingNo {
    static int findMissingMethod1( int[] arr, int n){
        // Method 1 - using summation
        int sum =0;
        for (int i :
             arr) {
            sum+=i;

        }
        return n*(n+1)/2 - sum;
    }
    static int findMissingMethod2( int[] arr, int n){
        // Method 1 - using XOR
        // Assume a1 ^ a2 ^ a3 ^ …^ an = a and a1 ^ a2 ^ a3 ^ …^ an-1 = b
        // Then a ^ b = an
        int a=0, b=0;
        for (int i:
             arr) {
            a^=i;

        }
       for ( int i =1; i <=n; i++){
           b^=i;
       }
       return a^b;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){

            int n = s.nextInt();
            int arr[] = new int[n-1];
            for ( int i =1; i < n; i++){
                arr[i]=s.nextInt();
            }
            findMissingMethod1(arr, n);
            findMissingMethod2(arr, n);

        }

    }
}