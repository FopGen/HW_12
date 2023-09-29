public class MainTwo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        StreamA streamA = new StreamA(fizzBuzz);
        StreamB streamB = new StreamB(fizzBuzz);
        StreamC streamC = new StreamC(fizzBuzz);
        StreamD streamD = new StreamD(fizzBuzz);

        streamA.start();
        streamB.start();
        streamC.start();
        streamD.start();

    }
}
