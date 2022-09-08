import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> generatedClients = generateClients(4, 6);
        System.out.println(Arrays.asList(generatedClients));

        while (true) {
            if (generatedClients.size() == 0) {
                break;
            }
            Person client = generatedClients.get(0);
            generatedClients.remove(0);
            client.numberOfTickets -= 1;
            System.out.println(client);

            if (client.numberOfTickets != 0) {
                generatedClients.add(client);
            }
        }
        System.out.println("The end!");
    }

    public static List<Person> generateClients(int sizeQueue, int maxTicket) {
        List<String> names = new ArrayList<>(Arrays.asList("Peter", "Olga", "Ivan", "Lev", "Vitaly", "Valeriy", "Roman"));
        List<String> surnames = new ArrayList<>(Arrays.asList("Ivanov", "Petrov", "Sidorov", "Sokolov", "Dmitriev"));
        List<Person> clients = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < sizeQueue; i++) {
            clients.add(
                    new Person(
                            names.get(random.nextInt(names.size())),
                            surnames.get(random.nextInt(surnames.size())),
                            random.nextInt(maxTicket) + 1
                    )
            );
        }
        return clients;
    }
}
