public class StreamA extends Thread {
    private FizzBuzz fizBuzz;

    public StreamA(FizzBuzz fizBuzz) {
        this.fizBuzz = fizBuzz;
    }

    @Override
    public void run() {
        for (int i = 0; i < fizBuzz.value; i++) {
            try {
                fizBuzz.fizz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
