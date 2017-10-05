import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel line1 = new  JLabel("To begin with,");
    JLabel line2 = new JLabel("Marley was dead.");
    public JBookQuote()
    {
        super("Book Quotes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(line1);
        add(line2);
    }
    public static void main(String[] args)
    {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(200, 100);
        aFrame.setVisible(true);
    }
}