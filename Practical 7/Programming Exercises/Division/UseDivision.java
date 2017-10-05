package Division;
public abstract class UseDivision
{
    public static void main(String[] args)
    {
        DomesticDivision Accounting = new
                DomesticDivision("Accounting", 2147, "Orlando");
        DomesticDivision Shining = new
                DomesticDivision("Hotel Management", 237, "Oregon");
        InternationalDivision Apple = new
                InternationalDivision("Technology", 999, "Murica", "Scamming");
        InternationalDivision Marketing = new
                InternationalDivision("Marketing", 456, "Australia","strayian");
        Marketing.display();
        Accounting.display();
        Shining.display();
        Apple.display();
    }
}