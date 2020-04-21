package bit;

public class UniqueString {

    public static void main(String[] args) {
        String str = "abdguyskhkc";

        System.out.println(findUnique(str));
    }

    private static boolean findUnique(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';
//            System.out.println(bitAtIndex);
            System.out.println((1 << bitAtIndex) + "--------->  "+ ((checker & (1 << bitAtIndex) )) );

            if ((checker & (1 << bitAtIndex) )> 0)
                return false;
            checker = checker | (1 << bitAtIndex);

        }
        return true;

    }
}
