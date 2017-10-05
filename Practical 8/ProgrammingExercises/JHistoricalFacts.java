import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton b = new JButton("Press to change fact");
    JLabel seperator = new JLabel("-----------------------------------------------------");
    JLabel fact1 = new JLabel("The US faked the Moon landing");
    JLabel fact2 = new JLabel("Ting go skrra");
    JLabel fact3 = new JLabel("Programming is hard");
    JLabel fact4 = new JLabel("OKC > Kid A");
    JLabel fact5 = new JLabel("MBDTF is an objectively good album");
    int counter = 0;
    public JHistoricalFacts()
    {
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(b);
        add(seperator);
        add(fact1);
        b.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JHistoricalFacts rFrame = new JHistoricalFacts();
        rFrame.setSize(400,200);
        rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(fact1);
            add(fact2);
        }
        else
        if(counter == 2)
        {
            remove(fact2);
            add(fact3);
        }
        else
        if(counter == 3)
        {
            remove(fact3);
            add(fact4);
        }
        else
        if(counter == 4)
        {
            remove(fact4);
            add(fact5);
        }
        else
        {
            remove(fact5);
            add(fact1);
        }

        validate();
        repaint();
    }

}