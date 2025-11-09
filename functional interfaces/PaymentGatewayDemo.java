interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated.");
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Paytm.");
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Paytm paytm = new Paytm();
        paytm.processPayment(1200);
        paytm.refund(200);
    }
}

