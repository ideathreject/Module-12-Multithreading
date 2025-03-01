import java.util.concurrent.TimeUnit;

public class  CurrentTimeEverySecond implements Runnable {
    @Override
    public void run() {
        while(true) {
            java.time.LocalTime currentTime = java.time.LocalTime.now();
            System.out.println(currentTime);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}