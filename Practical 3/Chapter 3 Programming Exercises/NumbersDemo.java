public class NumbersDemo {
    public static void main(){
        int a = 5, b = 3;
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
    System.out.println(a+"+ 5 = "+(a+5));
}
public static void displayNumberSquared(int a){
    System.out.println("a * a = "+ a*a);
}
}
