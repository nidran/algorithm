package backtracking;

public class InvaidParanthesis {
    static int N;
    public static void main (String[] args){
        String str ="(())()))())";
        N=str.length();
        check(str);
    }

    private static void check(String str) {
        if (str.isEmpty())
            return;


    }
    static boolean isParenthesis(char c)
    {
        return ((c == '(') || (c == ')'));
    }
    static boolean isValidString(String str)
    {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
                cnt++;
            else if (str.charAt(i) == ')')
                cnt--;
            if (cnt < 0)
                return false;
        }
        return (cnt == 0);
    }
}
