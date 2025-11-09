import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = msg -> msg.length();

        String message = "System maintenance at midnight.";
        System.out.println("Message Length: " + getLength.apply(message));
    }
}
