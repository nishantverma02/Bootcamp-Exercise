//Find average of the number inside integer list after doubling it.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 5, 3, 6, 7, 9);

        System.out.println("Required average is: "+integerList.stream().collect(Collectors.averagingInt((i)->2*i)));
    }
}