public class BackgroundJob {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Background job executing...");

        Thread t = new Thread(task);
        t.start();
    }
}
