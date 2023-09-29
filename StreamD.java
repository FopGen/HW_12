public class StreamD extends Thread {
    private FizzBuzz fizBuzz;

    public StreamD(FizzBuzz fizBuzz) {
        this.fizBuzz = fizBuzz;
    }

    @Override
    public void run() {
        for (int i = 0; i < fizBuzz.value; i++) {
            try {
                fizBuzz.number();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
