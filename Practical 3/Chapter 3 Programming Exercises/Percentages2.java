import java.util.Scanner;

public class Percentages2 {
        public static void main(String[] args){
            Scanner inputDevice = new Scanner(System.in);
            System.out.print("Please enter number a: ");
            double a = inputDevice.nextInt();
            System.out.print("Please enter number b: ");
            double b = inputDevice.nextInt();
            computePercent(a,b); }
        public static void computePercent(double a,double b){
            System.out.println(a+" is "+((a/b)*100)+ " percent of "+b);
        }
    }
