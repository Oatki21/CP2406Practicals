/**
 * Created by jc428928 on 1/09/17.
 */
import java.util.*;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double entry;
        double total = 0;
        double average;
        final int quit = 99999;
        int x = 0, y;
        System.out.print("Enter a number or "+quit+" to quit");
        entry = input.nextDouble();
        while(entry != quit && x < numbers.length)
        {
            numbers[x] = entry;
            total += numbers[x];
            ++x;
            if(x < numbers.length)
            {
                System.out.print("Enter next numeric value or " + quit + " to quit >> ");
                entry = input.nextDouble();
            }
        }
        if(x == 0)
            System.out.println("Diving by 0 hey... who do you think you are?");
        else
        {
            average = total / x;
            System.out.println("You entered " + x +
                    " numbers and their average is " + average);
            for(y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " +
                        (numbers[y] - average) + " away from the average");
        }
    }
}
