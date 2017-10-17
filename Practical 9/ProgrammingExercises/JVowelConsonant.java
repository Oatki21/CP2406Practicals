import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVowelConsonant extends JFrame implements ActionListener
{
    Container con = null;
    final int LETTERS_AT_A_TIME = 8;
    JButton[] b = new JButton[LETTERS_AT_A_TIME];
    final String[] LETTERS = {"A", "B", "C", "D","E","F", "G",
            "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] vowles = {"A", "E", "I", "O", "U", "Y"};
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel aLabel = new JLabel("");
    boolean alreadyUsed;
    int x;
    int rand;
    int[] rands = {-1, -1, -1, -1, -1, -1, -1, -1};
    public JVowelConsonant()
    {
        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
        {
            rand = (int)(Math.random() * LETTERS.length);
            rands[x] = rand;
        }
        setLayout(new GridLayout(2, 2));
        panel1.setLayout(new GridLayout(2, 2));
        panel2.setLayout(new GridLayout(2, 2));
        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
            b[x] = new JButton(LETTERS[rands[x]]);
        for(x = 0; x < 4; ++x)
            panel1.add(b[x]);
        for(; x < LETTERS_AT_A_TIME; ++x)
            panel2.add(b[x]);
        panel3.add(aLabel);
        add(panel1);
        add(panel2);
        add(panel3);
        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
            b[x].addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
            if (source == b[x])
            {
                if(b[x].getText() == "A" || b[x].getText() == "E" ||
                        b[x].getText() == "I" || b[x].getText() == "O" ||
                        b[x].getText() == "U")
                    aLabel.setText(b[x].getText() + " is a vowel");
                else
                    aLabel.setText(b[x].getText() + " is a consonant");
                rand = (int)(Math.random() * LETTERS.length);
                b[x].setText(LETTERS[rand]);
                x = LETTERS_AT_A_TIME;
            }
    }
    public static void main(String[] ags)
    {
        JVowelConsonant f = new JVowelConsonant();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}