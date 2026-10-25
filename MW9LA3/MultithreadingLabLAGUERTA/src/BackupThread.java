class BackupThread extends Thread {
    private String taskName;
    
    public BackupThread(String taskName) {
        this.taskName = taskName;
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + ": " + i);
            try {
                Thread.sleep(2000); // 2-second pause as required
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
        System.out.println(taskName + " completed.");
    }
}