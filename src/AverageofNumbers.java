import java.util.ArrayList;
import java.util.Scanner;

public class AverageofNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            System.out.println("Input numbers, type end to stop.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(input);
        }
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);

    }
}
