public class StreamB extends Thread {
    private FizzBuzz fizBuzz;

    public StreamB(FizzBuzz fizBuzz) {
        this.fizBuzz = fizBuzz;
    }

    @Override
    public void run() {
        for (int i = 0; i < fizBuzz.value; i++) {
            try {
                fizBuzz.buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
