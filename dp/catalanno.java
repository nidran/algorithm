package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class catalanno {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        catalan(n);
    }

    private static void catalan(int n) {
        int[] coeff = new int[n+1];
        coeff[0]=1;
        coeff[1]=1;
        for ( int i =2; i <n+1; i++){

           int res = 0;
           for ( int j =0; j <=i; j++){
//               System.out.println(i + " " + j);
               res += coeff[j]*coeff[i-j];
           }
           coeff[i]=res;


        }
        System.out.println(coeff[n]);
    }
}
