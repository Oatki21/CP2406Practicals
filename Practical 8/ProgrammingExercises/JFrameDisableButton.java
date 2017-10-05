import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Press Me");
    public JFrameDisableButton()
    {
        super("Frame");
        setVisible(true);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        button.setEnabled(false);
    }
    public static void main(String[] args)
    {
        JFrameDisableButton aFrame = new JFrameDisableButton();
        aFrame.setSize(200, 100);
        aFrame.setVisible(true);
    }
}