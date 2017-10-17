import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMovieFrame extends JFrame implements ActionListener
{
    JButton northButton = new JButton("North");
    JButton southButton = new JButton("South");
    JButton eastButton = new JButton("East");
    JButton westButton = new JButton("West");
    JButton centreButton = new JButton("gooey centre");
    JLabel northLabel = new JLabel("northside");
    JLabel southLabel = new JLabel("southside");
    JLabel eastLabel = new JLabel("eastside");
    JLabel westLabel = new JLabel("westcoast");
    JLabel centreLabel = new JLabel("centre of planet");
    public JMovieFrame()
    {
        setTitle("JMovieFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(westButton,"West");
        add(centreButton,"Center");
        add(eastButton,"East");
        add(northButton,"North");
        add(southButton,"South");
        eastButton.addActionListener(this);
        centreButton.addActionListener(this);
        westButton.addActionListener(this);
        northButton.addActionListener(this);
        southButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == northButton)
        {
            remove(northButton);
            add(northLabel, BorderLayout.NORTH);
        }
        else
        if(source == southButton)
        {
            remove(southButton);
            add(southLabel, BorderLayout.SOUTH);
        }
        else
        if(source == eastButton)
        {
            remove(eastButton);
            add(eastLabel, BorderLayout.EAST);
        }
        else
        if(source == westButton)
        {
            remove(westButton);
            add(westLabel, BorderLayout.WEST);
        }
        else
        {
            remove(centreButton);
            add(centreLabel, BorderLayout.CENTER);
        }
        invalidate();
        validate();
    }
    public static void main(String[] args)
    {
        JMovieFrame movieFrame = new JMovieFrame();
        movieFrame.setSize(650,300);
        movieFrame.setVisible(true);
    }
}
