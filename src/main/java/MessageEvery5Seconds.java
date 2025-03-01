import java.util.concurrent.TimeUnit;

public class MessageEvery5Seconds implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Прошло 5 секунд");
        }
    }
}