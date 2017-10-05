import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton2 extends JFrame implements ActionListener
{
    final int DIMENSION = 300;
    Container container = getContentPane();
    JButton button = new JButton("Press Me");
    int count = 0;
    final int MAXCOUNT = 8;
    JLabel label = new JLabel("Stop pushing my buttons!");
    public JFrameDisableButton2()
    {
        super("I've been framed");
        container.setLayout(new FlowLayout());
        setSize(DIMENSION, DIMENSION);
        setVisible(true);
        container.add(button);
        container.add(label);
        label.setVisible(false);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++count;
        if(count == MAXCOUNT)
        {
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        JFrameDisableButton2 frame =
                new JFrameDisableButton2();
    }
}