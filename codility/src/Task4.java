import java.util.ArrayList;
import java.util.Collections;


class Solution4{

    public int solution4_foo(int[] A, int K)
    {
        //length of an array A
        int N = A.length;

        if((N < 1 || N > 100000) || (K < 1 || K > 100000))
        {
            System.err.println("N and K are integers within the range [1, ... , 100000]");
            System.exit(1);
        }

        //first condition
        if (K > N)
        {
            return -1;
        }

        int w = 0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int d:A)
        {
            if (d%2 != 1)
                even.add(d);
            else
                odd.add(d);
        }

        int x1 = even.size()-1;
        int x2 = odd.size()-1;

        //sorting...
        Collections.sort(even);
        Collections.sort(odd);

        while (K>0)
        {
            if (K%2 == 1)
            {
                if (x1 >= 0)
                {
                    w = w + even.get(x1);
                    x1 = x1-1;
                }
                else
                    return -1;
                K = K-1;
            }
            else if (x1 >= 1 && x2 >= 1)
            {
                if (even.get(x1) + even.get(x1 - 1) <= odd.get(x2) + odd.get(x2 - 1))
                {
                    w = w + odd.get(x2) + odd.get(x2 - 1);
                    x2 = x2-2;
                }
                else
                {
                    w = w + even.get(x1) + even.get(x1 - 1);
                    x1 = x1-2;
                }
                K = K-2;
            }
            else if (x1 >= 1)
            {
                w = w + even.get(x1) + even.get(x1 - 1);
                x1 = x1-2;
                K = K-2;
            }
            else if (x2 >= 1)
            {
                w = w + odd.get(x2) + odd.get(x2 - 1);
                x2 = x2-2;
                K = K-2;
            }
            else
                return -1;
        }
        return w;
    }
}

public class Task4{

    public static void main(String[] args)
    {
        int [] A1 = { 2, 4, 10, 3, 5 };
        int K1 = 3;
        int result = new Solution4().solution4_foo(A1, K1);

        System.out.println(result);
    }
}


