/**
 * Created by jc428928 on 11/08/17.
 */
public class QuartsToGallons {
    public static void main(String[] args) {
        int quarts = 4;
        int jobQuarts = 18;
        System.out.println("A job that requires "+jobQuarts+" quarts requires "+(jobQuarts/quarts)+" gallons plus "+(jobQuarts%quarts)+ " quarts");
    }
}
