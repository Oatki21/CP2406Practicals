public class DemoHorses
{
    public static void main(String args[])
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("Slim Dusty");
        horse1.setColor("blue");
        horse1.setBirthYear(1998);
        horse2.setName("Lightning Mcqueen");
        horse2.setColor("red");
        horse2.setBirthYear(2011);
        horse2.setRaces(4);
        System.out.println(horse1.getName() + " is " +
                horse1.getColour() + " and was born in the year " + horse1.getBirthYear());
        System.out.println(horse2.getName() + " is " +
                horse2.getColour() + " and was born in the year " + horse2.getBirthYear());
        System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
    }
}