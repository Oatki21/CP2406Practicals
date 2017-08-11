import javax.swing.*;

/**
 * Created by jc428928 on 11/08/17.
 */
public class ChiliToGoProfit {
    public static void main(String[] args){
        int adultPrice = 7;
        int childPrice = 4;
        double profitAdult = adultPrice-4.35;
        double  profitChild = childPrice-3.10;
        int adultMeals = Integer.parseInt(JOptionPane.showInputDialog(null,"Howdy partner, how many adult meals for this table?"));
        int childMeals = Integer.parseInt(JOptionPane.showInputDialog(null,"Howdy partner, how many child meals for this table?"));
        JOptionPane.showMessageDialog(null,adultMeals+" Adult meals and "+childMeals+" child meals totals to "+(adultMeals+childMeals)+" meals for a total price of $"+(adultMeals*adultPrice+childMeals*childPrice));
        JOptionPane.showMessageDialog(null,adultMeals+" Adult meals creates $"+(profitAdult*adultMeals)+" profit."+childMeals+" child meals creates $"+(profitChild*childMeals)+" profit. The total profit made is $"+(adultMeals*profitAdult+childMeals*profitChild));
    }
}
