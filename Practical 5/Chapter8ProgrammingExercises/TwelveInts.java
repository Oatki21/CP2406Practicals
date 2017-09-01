import javax.swing.*;
import java.util.Scanner;

/**
 * Created by jc428928 on 1/09/17.
 */
public class TwelveInts
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 12 integers (1 per line)");
        int[] numbers = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}

