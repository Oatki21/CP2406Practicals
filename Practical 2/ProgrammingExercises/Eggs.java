import javax.swing.*;

/**
 * Created by jc428928 on 11/08/17.
 */
public class Eggs {
    public static void main(String[] args) {
        double dozenPrice = 3.25;
        double eggPrice = 0.45;
        String input = JOptionPane.showInputDialog("How many eggs?");
        int eggs = Integer.parseInt(input);
        int dozen = eggs/12;
        int looseEggs = eggs%12;
        JOptionPane.showMessageDialog(null,"You ordered "+(eggs)+ " eggs. That's "+(dozen)+" dozen at $3.25 per dozen and "+(looseEggs)+" loose eggs at 45 cents each for a total of $"+(dozenPrice*dozen+eggPrice*looseEggs));
    }
}