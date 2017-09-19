public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setInvoiceNumber(1);
        item1.setDescription("1 kg of Whiskers cat food");
        item1.setPrice(39.99);
        item2.setInvoiceNumber(2);
        item2.setDescription("A cool bird cage");
        item2.setPrice(199.99);
        pet1.setInvoiceNumber(3);
        pet1.setDescription("Maltese Shitzu");
        pet1.setPrice(420.17);
        pet1.setIsVaccinated(false);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(true);
        pet2.setInvoiceNumber(4);
        pet2.setDescription("Rare Oriental Seahorse");
        pet2.setPrice(250);
        pet2.setIsVaccinated(false);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(false);
        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }
    public static void display(ItemSold item)
    {
        System.out.println("Invoice  el numero #" + item.getInvoiceNumber());
        System.out.println("    Description: " + item.getDescription());
        System.out.println("    Price: $" + item.getPrice());
    }
    public static void displayPetData(PetSold item)
    {
        System.out.println("    Has been vaccinated: " + item.getIsVaccinated());
        System.out.println("    Has been neutered: " + item.getIsNeutered());
        System.out.println("    Has been housebroken: " + item.getIsHousebroken());
    }
}