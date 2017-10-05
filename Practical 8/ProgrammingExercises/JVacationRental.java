import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    final int PARKPRICE = 600, POOLPRICE = 750, LAKEPRICE = 825;
    int totalPrice = 0;
    ButtonGroup location = new ButtonGroup();
    JCheckBox parkBox = new JCheckBox("Parkside",false);
    JCheckBox poolBox = new JCheckBox("Poolside", false);
    JCheckBox lakesideBox = new JCheckBox("Lakeside", false);
    final int ONEPRICE = 0, TWOPRICE = 75, THREEPRICE = 150;
    ButtonGroup bedroomGroup = new ButtonGroup();
    JCheckBox oneBox = new JCheckBox("1 bedroom", false);
    JCheckBox twoBox = new JCheckBox("2 bedrooms", false);
    JCheckBox threeBox = new JCheckBox("3 bedrooms", false);
    final int NOMEALSPRICE = 0, MEALSPRICE = 200;
    //Meal or no meal ha ha ha
    ButtonGroup mealGroup = new ButtonGroup();
    JCheckBox noMealsBox = new JCheckBox("No meals",false);
    JCheckBox mealsBox = new JCheckBox("Meals included",false);
    JTextField endPrice = new JTextField(10);
    //totalPrice conflicted with Historical Facts
    String output;
    public JVacationRental()
    {
        super("Vacation rentals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        location.add(parkBox);
        parkBox.addItemListener(this);
        location.add(poolBox);
        poolBox.addItemListener(this);
        location.add(lakesideBox);
        lakesideBox.addItemListener(this);
        bedroomGroup.add(oneBox);
        twoBox.addItemListener(this);
        bedroomGroup.add(twoBox);
        threeBox.addItemListener(this);
        bedroomGroup.add(threeBox);
        mealGroup.add(noMealsBox);
        noMealsBox.addItemListener(this);
        mealGroup.add(mealsBox);
        mealsBox.addItemListener(this);
        add(parkBox);
        add(poolBox);
        add(lakesideBox);
        add(oneBox);
        add(twoBox);
        add(threeBox);
        add(noMealsBox);
        add(mealsBox);
        endPrice.setText("$0.00");
        add(endPrice);
    }
    public static void main(String[] arguments)
    {
        JVacationRental aFrame = new JVacationRental();
        aFrame.setSize(320,200);
        aFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        if(source == parkBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += PARKPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= PARKPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
        else if(source == poolBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += POOLPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= POOLPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
        else if(source == lakesideBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += LAKEPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= LAKEPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
        else if(source == oneBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += ONEPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= ONEPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
        else if(source == twoBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += TWOPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= TWOPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
        else if(source == threeBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += THREEPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= THREEPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
        else if(source == noMealsBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += NOMEALSPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= NOMEALSPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
        else if(source == mealsBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += MEALSPRICE;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= MEALSPRICE;
            output = " " + totalPrice;
            endPrice.setText(output);
        }
    }
}