public class Billing {
    final static double TAX = 0.08;
    public static void main(String [] args){
        double bill;
        double price = 8.00;
        int quantity = 4;
        double coupon = 20;
         bill = computeBill(price);
        System.out.println("The total for a photobook that costs $"+price+" is $" + bill);
        bill = computeBill(price, quantity);
        System.out.println("The total for "+quantity+" photobooks that cost $"+price+" is $" +
                bill);
        bill = computeBill(price,quantity,coupon);
        System.out.println("The total for "+quantity+" photobooks that cost $"+price+" with a $"+coupon+" coupon is $" +
                bill);
    }
    public static double computeBill(double price){
        double bill = price + price * TAX;
        return bill;
    }
    public static double computeBill(double price, int quantity){
        double bill = price * quantity;
        bill = bill + bill * TAX;
        return bill;
    }
    public static double computeBill(double price, int quantity, double coupon){
        double bill = price * quantity;
        bill = bill - coupon;
        bill = bill + bill * TAX;
        return bill;
    }
}
