import javax.swing.*;

/**
 * Created by jc428928 on 11/08/17.
 */
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("How many inches?");
        int inches = Integer.parseInt(input);
        int feet = inches / 12;
        JOptionPane.showMessageDialog(null,inches+" inches becomes "+(inches/feet)+" feet and "+(inches%feet)+" inches");
    }
}
