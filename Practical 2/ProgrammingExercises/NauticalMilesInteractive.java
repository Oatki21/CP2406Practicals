import javax.swing.*;

/**
 * Created by jc428928 on 11/08/17.
 */
public class NauticalMilesInteractive {
    public static void main(String[] args)
    {
        double kilometers = 1.852;
        double miles = 1.150779;
        String input;
        input = JOptionPane.showInputDialog("How many nautical miles?");
        double nauticalMiles = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,nauticalMiles+(" Nautical miles is equal to "+(nauticalMiles*kilometers)+" kilometers and "+(nauticalMiles*miles)+" miles."));

    }
}
