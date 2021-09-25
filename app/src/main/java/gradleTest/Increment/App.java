/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleTest.Increment;

import java.util.Scanner;

public class App {
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
                n -= 1;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("Sum of numbers from 1 to 10 is " + getSum(num));
    }
}
