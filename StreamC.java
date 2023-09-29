public class StreamC extends Thread {
    private FizzBuzz fizBuzz;

    public StreamC(FizzBuzz fizBuzz) {
        this.fizBuzz = fizBuzz;
    }

    @Override
    public void run() {
        for (int i = 0; i < fizBuzz.value; i++) {
            try {
                fizBuzz.fizzbuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
