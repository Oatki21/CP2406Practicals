public class DemoCandles
{
    public static void main(String args[])
    {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();
        aCandle.setColour("purple");
        aCandle.setHeight(6);
        aScentedCandle.setColour("aqua");
        aScentedCandle.setScent("bamboo");
        aScentedCandle.setHeight(6);
        System.out.println("The " + aCandle.getColour() + " Candle is " + aCandle.getHeight() + " inches tall and " +
                "costs $" + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getColour() + " Candle is " + aScentedCandle.getHeight() + " inches tall, smells like " +
                aScentedCandle.getScent() +
                " and costs $" + aScentedCandle.getPrice());
    }
}