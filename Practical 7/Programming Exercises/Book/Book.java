package Book;

public abstract class Book
{
    String title = new String();
    double price;
    public Book(String t)
    {
        title = t;
    }
    public String returnTitle ()
    {
        return title;
    }
    public double returnPrice ()
    {
        return price;
    }
    public abstract void setPrice();
}