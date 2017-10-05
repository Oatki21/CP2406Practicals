package Division;

/**
 * Created by jc428928 on 22/09/17.
 */
public class DomesticDivision extends Division
{
    protected String state;
    public DomesticDivision(String title, int acc, String st)
    {
        super(title, acc);
        state = st;
    }
    public void display()
    {
        System.out.println("Domestic Division: " +
                divisionTitle + "  Acc #: " + accNum +
                "\nLocated in " + state);
    }
}
