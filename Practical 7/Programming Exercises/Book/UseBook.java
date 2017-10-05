package Book;

public class UseBook
{
    public static void main(String[] args)
    {
        Fiction aNovel = new Fiction("Big L - Gone too soon");
        NonFiction aManual = new
                NonFiction("How to make friends and influence people");
        System.out.println("Book.Fiction " +
                aNovel.returnTitle() + " costs $" +
                aNovel.returnPrice());
        System.out.println("Non-Book.Fiction " +
                aManual.returnTitle() + " costs $" +
                aManual.returnPrice());
    }
}