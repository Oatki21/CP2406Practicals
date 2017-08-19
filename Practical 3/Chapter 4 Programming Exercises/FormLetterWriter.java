public class FormLetterWriter
{
    public static void main(String[] args){
        String firstName = "Oliver";
        String lastName = "Atkinson";
        displaySalutation(lastName);
        displaySalutation(firstName,lastName);
    }
    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms "+lastName+",");
        System.out.println("Thank you for your recent order.");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear "+firstName+" "+lastName+",");
        System.out.println("Thank you for your recent order.");
    }
}
