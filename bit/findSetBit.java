// Java program to find position of only
// set bit in a given number

class GFG {

    // A utility function to check whether
    // n is power of 2 or not
    static boolean isPowerOfTwo(int n)
    {
        return n > 0 && ((n & (n - 1)) == 0);
    }

    // Returns position of the only set bit in 'n'
    static int findPosition(int n)
    {
        if (!isPowerOfTwo(n))
            return -1;

        int count = 0;

        // One by one move the only set bit
        // to right till it reaches end
        while (n > 0) {
            n = n >> 1;

            // increment count of shifts
            ++count;
        }

        return count;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 0;
        int pos = findPosition(n);
        if (pos == -1)
            System.out.println("n = " + n + ", Invalid number");
        else
            System.out.println("n = " + n + ", Position " + pos);

        n = 12;
        pos = findPosition(n);
        if (pos == -1)
            System.out.println("n = " + n + ", Invalid number");
        else
            System.out.println("n = " + n + ", Position " + pos);

        n = 128;
        pos = findPosition(n);
        if (pos == -1)
            System.out.println("n = " + n + ", Invalid number");
        else
            System.out.println("n = " + n + ", Position " + pos);
    }
}