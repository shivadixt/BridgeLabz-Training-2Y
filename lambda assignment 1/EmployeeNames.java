import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Amit", "Riya", "Karan");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}

