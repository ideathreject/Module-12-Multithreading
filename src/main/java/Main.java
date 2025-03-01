public class Main {
    public static void main(String[] args) throws InterruptedException {
       Thread thread1 = new Thread(new CurrentTimeEverySecond());
       Thread thread2 = new Thread(new MessageEvery5Seconds());
       thread1.start();
       thread2.start();
       FizzBuzzFizzbuzz fizzBuzz = new FizzBuzzFizzbuzz(55);
       Thread threadA = new Thread(() -> {
            try {
                fizzBuzz.fizz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
       Thread threadB = new Thread(() -> {
            try {
                fizzBuzz.buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
       Thread threadC = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
       Thread threadD = new Thread(() -> {
            try {
                fizzBuzz.number();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
       threadA.start();
       threadB.start();
       threadC.start();
       threadD.start();
    }
}
