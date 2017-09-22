package PhoneCall;

/**
 * Created by jc428928 on 22/09/17.
 */
public abstract class PhoneCall {
    String number;
    double cost;
    public PhoneCall(String n) {
        number = n;
        cost = 0.00;
    }

    public void setPrice(double c){
        cost = c;
    }
    public abstract String getNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}


