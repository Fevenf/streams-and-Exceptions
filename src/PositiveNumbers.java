
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class  PositiveNumbers {

    public static void main(String[] args) {
 
        List<Integer> number = new ArrayList<>();
        number.add(-9);
        number.add(-20);
        number.add(70);
        number.add(60);
        number.add(8);
        number.add(2);

        System.out.println(positive(number));
        System.out.println(positiveNumber(number));
        
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> positiveNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));

                
    }

    
}