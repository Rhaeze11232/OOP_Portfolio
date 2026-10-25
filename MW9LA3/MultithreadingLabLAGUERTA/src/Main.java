public class Main {
    public static void main(String[] args) {
        // Original Tasks (1-second delay)
        TaskThread task1 = new TaskThread("Downloading File", 1000);
        TaskThread task2 = new TaskThread("Playing Music", 1000);
        TaskThread task3 = new TaskThread("Saving Data", 1000);
        
        // Step 6: Uploading File (1-second delay)
        TaskThread task4 = new TaskThread("Uploading File", 1000);
        
        // Step 7: System Backup (2-second delay)
        TaskThread task5 = new TaskThread("System Backup", 2000);
        
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();
    }
}