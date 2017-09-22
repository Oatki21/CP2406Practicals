package PhoneCall;
public class OutgoingPhoneCall extends PhoneCall
{
    public final static double RATE = .04;
    private int minutes;
    public OutgoingPhoneCall(String num, int mins)
    {
        super(num);
        minutes = mins;
        cost = minutes * RATE;
    }
    public void getInfo()
    {
        System.out.println("Outgoing phone call " +
                getNumber() + " " + RATE +
                " per minute at " + minutes +
                " minutes. Total is $" +
                getPrice());
    }
    public String getNumber()
    {
        return number;
    }
    public double getPrice()
    {
        return cost;
    }
}