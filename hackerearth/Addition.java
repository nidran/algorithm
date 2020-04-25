//package hackerearth;/* IMPORTANT: Multiple classes and nested static classes are supported */
//
///*
// * uncomment this if you want to read input.
////imports for BufferedReader
//
//
////import for Scanner and other utility classes
//import java.util.*;
//*/
//
//// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
//import javafx.util.converter.BigIntegerStringConverter;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.math.BigInteger;
//import java.util.Arrays;
//class Addition {
//    public static void main(String args[]) throws Exception {
//        /* Sample code to perform I/O:
//         * Use either of these methods for input
//
//        //BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String name = br.readLine();                // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//
//        //Scanner
//        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//
//        */
//
//        // Write your code here
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            String name = br.readLine();
//            while (name != null) {
//               Long[] array =  Arrays.stream(name.split("\\s"))
//                        .map(BigInteger::new)
//                        .toArray(BigInteger[]::new);
////                BigInteger[] array = Arrays.stream(name.split("\\s")).map(Long::parseUnsignedLong).toArray();
//                System.out.println(array[0].add(array[1]));
//                name = br.readLine();
//                System.out.println(Math.min(array[0], array[1]));
//            }
//        } catch (Exception e) {
//
//        }
//    }
//}
