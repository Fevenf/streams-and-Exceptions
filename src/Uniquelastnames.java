
import java.util.ArrayList;
import java.util.Scanner;

public class Uniquelastnames {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter personal information input? \"quit\" ends:");
            String input = sc.nextLine();

            
            if(input.equalsIgnoreCase("quit")){
                break;
                
            }
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            System.out.print("Enter the year of birth: ");
            int birthYear = Integer.valueOf(sc.nextLine());

            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

        persons.stream()
        .map(person -> person.getLastName())
        .distinct()
        .sorted()
        .forEach(lastName -> System.out.println(lastName));

    }
}

