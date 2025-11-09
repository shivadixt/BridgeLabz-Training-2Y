import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String message;
    String type; // e.g. "Critical", "Normal"

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Patient A - Heart Rate High", "Critical"),
            new Alert("Patient B - Normal Checkup", "Normal"),
            new Alert("Patient C - Low Oxygen", "Critical")
        );

        // Only show critical alerts
        Predicate<Alert> isCritical = alert -> alert.type.equalsIgnoreCase("Critical");

        List<Alert> criticalAlerts = alerts.stream()
                                           .filter(isCritical)
                                           .collect(Collectors.toList());

        System.out.println("Critical Alerts:");
        criticalAlerts.forEach(a -> System.out.println(a.message));
    }
}
