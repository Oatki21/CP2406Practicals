package Division;

/**
 * Created by jc428928 on 22/09/17.
 */
public abstract class Division
{
    protected String divisionTitle;
    protected int accNum;
    public Division(String title, int acc)
    {
        divisionTitle = title;
        accNum = acc;
    }
    public abstract void display();
}