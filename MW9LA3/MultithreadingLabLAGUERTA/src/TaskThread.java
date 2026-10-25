class TaskThread extends Thread {
    private String taskName;
    private int sleepTime; 
    
    public TaskThread(String taskName, int sleepTime) {
        this.taskName = taskName;
        this.sleepTime = sleepTime;
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Updated to match the "Final Output" format in the lab document
            System.out.println(taskName + ": " + i); 
            try {
                Thread.sleep(sleepTime); 
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
        System.out.println(taskName + " completed.");
    }
}