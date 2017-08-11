import javax.swing.*;

/**
 * Created by jc428928 on 11/08/17.
 */
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int quarts = 4;
        String input;
        input = JOptionPane.showInputDialog("How many quarts does the job require?");
        int jobQuarts = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,"A job that requires "+jobQuarts+" quarts requires "+(jobQuarts/quarts)+" gallons plus "+(jobQuarts%quarts)+ " quarts");
    }
}
