import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> userInputs = new ArrayList<>();
        System.out.println("Enter a number between 1 and 5 . Type negative number to stop");
        while(true) {
            int input = Integer.valueOf(sc.nextLine());

            if (input < 0) {
                break;
            }

            userInputs.add(input);
        }

        userInputs.stream()
                .filter(number -> number > 0 && number < 6)
                .forEach(number -> System.out.println(number));
    }
}