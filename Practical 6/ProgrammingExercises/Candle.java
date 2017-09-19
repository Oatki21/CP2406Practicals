public class Candle
{
    private String colour;
    private int height;
    double price;
    public String getColour()
    {
        return colour;
    }
    public int getHeight()
    {
        return height;
    }
    public double getPrice()
    {
        return price;
    }
    public void setColour(String c)
    {
        colour = c;
    }
    public void setHeight(int h)
    {
        final double PER_INCH = 2;
        height = h;
        price = height * PER_INCH;
    }
}