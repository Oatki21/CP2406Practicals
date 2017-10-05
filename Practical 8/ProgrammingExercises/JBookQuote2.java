import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel line1 = new  JLabel("I never learned to read...");
    JLabel line2 = new JLabel("Life is torture.");
    JButton button = new JButton("Book title:");
    JLabel bookTitle = new JLabel("Cool Book");
    public JBookQuote2()
    {
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(line1);
        add(line2);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(bookTitle);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(500, 100);
        aFrame.setVisible(true);
    }
}