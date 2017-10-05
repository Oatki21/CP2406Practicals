package Book;
public class BookArray
{
    public static void main(String[] args)
    {
        Book someBook[] = new Book[10];
        int x;
        someBook[0] = new Fiction("1");
        someBook[1] = new NonFiction("2");
        someBook[2] = new Fiction("3");
        someBook[3] = new NonFiction("4");
        someBook[4] = new Fiction("5");
        someBook[5] = new NonFiction("6");
        someBook[6] = new Fiction("7");
        someBook[7] = new Fiction("8");
        someBook[8] = new Fiction("9");
        someBook[9] = new Fiction("10");
        for(x = 0; x < someBook.length; ++x)
            System.out.println("Book: " +
                    someBook[x].returnTitle() + " costs $" +
                    someBook[x].returnPrice());
    }
}
