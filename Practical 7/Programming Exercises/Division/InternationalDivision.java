package Division;

/**
 * Created by jc428928 on 22/09/17.
 */
public class InternationalDivision extends Division
{
    protected String country;
    protected String language;
    public InternationalDivision(String title, int acc, String ctry, String lang)
    {
        super(title, acc);
        country = ctry;
        language = lang;
    }
    public void display()
    {
        System.out.println("International Division: " + divisionTitle +
                "  Acct #: " + accNum + "\nLocated in " + country +
                " Main language spoken is " + language);
    }
}