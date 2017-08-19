// This class discounts prices by 10%
public class FixDebugFour4
{
   public static void main(String args[])
   {
      final double DISCOUNT_RATE = 0.90;
      double price = 1000.00;
      double price2 = 100.00;
      tenPercentOff(price, DISCOUNT_RATE);
      tenPercentOff(price2, DISCOUNT_RATE);
   }
   public static void tenPercentOff(double p, double DISCOUNT_RATE)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off " + p);
      System.out.println("New price is $" + newPrice);
   }
}
