package Strings;

public class Annagrams {

    public static void main (String args[]){

        String a = "cde";
        String b ="abc";
        findAnnagrams (a , b);
    }

    private static void findAnnagrams(String a, String b) {
        int[] ele = new int [100];

        for ( int i = 0; i < a.length(); i++){
            ele[a.charAt(i)-'a']+=1;

        }

        for ( int i = 0; i<b.length(); i++){
            ele[b.charAt(i)-'a']-=1;
        }

        int count = 0;
        for ( int i = 0; i<100; i++){
            if ( ele[i]!=0)
                count+=1;

        }
        System.out.println(count);
    }
}
