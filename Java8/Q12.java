//Find the first even number in the integer list which is greater than 3.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Q12 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 3, 5, 6, 4, 9);
        Optional<Integer> optionalInteger = integerList.stream().filter((i) -> i % 2 == 0).filter((i) -> i > 3).findFirst();
        if(optionalInteger.isPresent())
            System.out.println("Required integer is: "+optionalInteger);
        else
            System.out.println("No such integer Present");

    }
}