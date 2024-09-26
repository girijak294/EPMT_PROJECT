
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 9, 1, 6, 7, 8);
        
        
        Optional<Integer> sL = numbers.stream()
                .distinct()  
                .sorted(Comparator.reverseOrder()) 
                .skip(1)  
                .findFirst(); 
        
        
        sL.ifPresent(num -> System.out.println("Second largest number is: " + num));
    }
}
