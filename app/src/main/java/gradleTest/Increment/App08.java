package gradleTest.Increment;

public class App08 {
    public static int getSum(int n)
    {
        int total = 0;

        if(n > 0)
        {
            while(n > 0)
            {
                total += n;
                n -= 1;
            }
        }
        else
        {
            while(n < 0)
            {
                total += n;
                n += 1;
            }
        }

        return total;
    }
}
