package bit;

public class CountSetBits {
    /**
     * Brian Kernighan’s Algorithm:
     * 1  Initialize count: = 0
       2  If integer n is not zero
     (a) Do bitwise & with (n-1) and assign the value back to n
     n: = n&(n-1)
     (b) Increment count by 1
     (c) go to step 2
     3  Else return count

     Time Complexity: O(logn)
     **/
    public static int findSetBits ( int  number){
        int setBits= 0;
        while (number > 0 ){
            number &= number -1;
            setBits+=1;
        }

        return setBits;
    }

    public static void main (String[] args){


    }
}
