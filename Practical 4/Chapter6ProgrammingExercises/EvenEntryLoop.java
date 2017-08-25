import java.util.Scanner;

/**
 * Created by jc428928 on 25/08/17.
 */
public class EvenEntryLoop {
    public static void main(String[] args){
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = input.nextInt();
        while (num != 999)
        {
            if (num %2 == 0) {
                System.out.println("That's even");
            }
                else
                System.out.println("That's odd");
            System.out.print("Enter a number ");
            num = input.nextInt();
        }
    }
}

