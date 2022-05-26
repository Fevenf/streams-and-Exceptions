import java.util.ArrayList;
import java.util.Scanner;

public class AverageofSelectedNumbers {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> inputs = new ArrayList<>();

    while(true){
        System.out.println("Input numbers, type end to stop.");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("end")) {
            break;
        }
        inputs.add(input); 
    }
    double positiveAverage = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .filter(num -> num > -1)
    .average()
    .getAsDouble();
    
    double negativeAverage = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .filter(num -> num < 0)
    .average()
    .getAsDouble();

    System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
    String choose = scanner.nextLine();

    if (choose.equals("p")) {
        System.out.println("Average of the positive numbers: " + positiveAverage);
    } else if (choose.equals("n")) {
        System.out.println("Average of the negative numbers: " + negativeAverage);
    } else {
        System.out.println("Invalid choice!");
    }
}
}

