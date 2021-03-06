package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given an array of size N containing 0s, 1s, and 2s; sort the array in ascending order.
 * <p>
 * Input:
 * First line of input contains number of testcases T.
 * For each testcase, there will be two lines, first of which will contain N.
 * The second lines contains the elements of the array.
 * <p>
 * Output:
 * Print sorted array.
 * <p>
 * Your Task:
 * Complete the function sort012() that takes array and n and sorts the array in place.
 * <p>
 * Constraints:
 * 1 <= T <= 50
 * 1 <= N <= 10^5
 * 0 <= A[i] <= 2
 * <p>
 * Example:
 * Input :
 * 2
 * 5
 * 0 2 1 2 0
 * 3
 * 0 1 0
 * <p>
 * Output:
 * 0 0 1 2 2
 * 0 0 1
 */

class Sort012 {

    // } Driver Code Ends


//User function template for Java

    public static void sort012(int a[], int n){
        int first =0;
        int last = n-1;
        int i = 0;
        while ( i <= last){
            if (a[i]==2){
                int temp = a[last];
                a[last]=a[i];
                a[i]= temp;
                last--;
            }
            else if(a[i]==0)
            {
                int temp=a[first];
                a[first]=a[i];
                a[i]=temp;
                first++;
                i++;
            }
            else
            {
                i++;
            }
        }

    }


    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends