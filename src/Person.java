public class Person {
    public String name;
    String surname;
    int numberOfTickets;

    public Person(String name, String surname, int numberOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;
    }


    @Override
    public String toString() {
        return name + " " + surname + " took a ride on the attraction" + ": " + numberOfTickets + " tickets";
    }
}
