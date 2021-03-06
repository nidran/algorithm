package Strings;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader


//import for Scanner and other utility classes

*/


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Annagrams {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        int count = Integer.parseInt(ip);
        int i = 0;
        do {
            String a = br.readLine();
            String b = br.readLine();
            int[] ele = new int[26];

            for (int j = 0; j < a.length(); j++) {
                ele[a.charAt(j) - 'a'] += 1;

            }

            for (int k = 0; k < b.length(); k++) {
                ele[b.charAt(k) - 'a'] -= 1;
            }

            int counter = 0;
            for (int l = 0; l < 26; l++) {
                if (ele[l] != 0)
                    counter += Math.abs(ele[l]);

            }

            System.out.println(counter);
            i++;
        } while (i < count);
    }
}




