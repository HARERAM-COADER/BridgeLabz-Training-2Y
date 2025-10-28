public class BackgroundJobExecutor {
    public static void main(String[] args) {
        Runnable dataProcessingJob = () -> {
            System.out.println("Background job started: Processing data...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Data processing job was interrupted.");
            }
            System.out.println("Background job finished.");
        };
        Thread backgroundThread = new Thread(dataProcessingJob);
        
        System.out.println("Starting the background job from the main thread.");
        backgroundThread.start();
        System.out.println("Main thread continues execution while background job runs.");
    }
}
