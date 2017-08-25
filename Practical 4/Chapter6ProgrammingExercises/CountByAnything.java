import java.util.Scanner;

/**
 * Created by jc428928 on 25/08/17.
 */
public class CountByAnything {
    public static void main(String[] args) {
        int min = 1, max = 100,num,count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = input.nextInt();
        while (min <= max) {
            System.out.print(min + "  ");
            count++;
            if (count % 10 == 0)
                System.out.println();
            min=min+num;

        }
    }
}