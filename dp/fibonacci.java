package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {

    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib(n);
    }

    private static void fib(int n) {
        int a =0;
        int b =1;
        int c ;

        for ( int i =0; i <=n-2; i++){
            c = a + b;
            a = b;
            b = c;


        }
        System.out.println("Fib of n " + b);
    }
}
