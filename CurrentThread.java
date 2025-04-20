public class CurrentThread {
    public static void main(String[] args) {
        // Get the current thread
        Thread currentThread = Thread.currentThread();

        // Display information about the current thread
        System.out.println("Current thread name: " + currentThread.getName());

        System.out.println("Current thread priority: " + currentThread.getPriority());

        // Change the name and priority of the current thread
        currentThread.setName("MainThread");
        currentThread.setPriority(Thread.MAX_PRIORITY);

        // Display the updated information about the current thread
        System.out.println("\nUpdated thread name: " + currentThread.getName());
        System.out.println("Updated thread priority: " + currentThread.getPriority());
    }
}