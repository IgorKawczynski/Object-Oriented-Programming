class Solution3{

    public int solution3(String S){
        if(S.length()<1 || S.length() >40000)
        {
            System.err.println("Given String's length must be within the range of [1, ... ,40000");
            System.exit(1);
        }
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i) != 'a' && S.charAt(i) != 'b')
            {
                System.err.println("Given String must contain only 'a' or|and 'b' letters !!");
                System.exit(1);
            }
        }
        int maxcount = 0;
        int count = 1;
        for (int i = 1; i < S.length(); i++)
        {
            if (S.charAt(i) != S.charAt(i - 1))
            {
                maxcount = Math.max(maxcount, count);
                count = 1;
            }
            else
                count++;
        }
        maxcount = Math.max(maxcount, count);
        count = 1;
        int res = 0;
        for (int i = 1; i < S.length(); i++)
        {
            if (S.charAt(i) != S.charAt(i - 1))
            {
                res = res + maxcount - count;
                count = 1;
            }
            else
                count++;
        }
        res = res + maxcount - count;
        return res;
    }
}


public class task3 {

    public static void main(String[] args)
    {
        int result1 = new Solution3().solution3("babaa");
        int result2 = new Solution3().solution3("bbbab");
        int result3 = new Solution3().solution3("bbbaaabbb");
        int result4 = new Solution3().solution3("aaabaababa");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
