
import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter number a: ");
        int a = inputDevice.nextInt();
        System.out.print("Please enter number b: ");
        int b = inputDevice.nextInt();
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
public static void displayTwiceTheNumber(int a){
    System.out.println(a);
    System.out.println(a);
    }
public static void displayNumberPlusFive(int a){
    System.out.println(a+" + 5 = "+(a+5));
}
public static void displayNumberSquared(int a){
    System.out.println("a * a = "+ a*a);
}
}
