import java.util.Date;

public class Main{
    public static void main(String[] args) throws InterruptedException {

        new counterThreadfor1sec().start();
        new counterThreadfor5sec().start();

        
    }
}
class counterThreadfor1sec extends Thread{
    @Override
    public void run() {
        Date date = new Date();
        long startMillis = System.currentTimeMillis();
        while(!isInterrupted()){

            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Минуло " + (System.currentTimeMillis()-startMillis)/1000 + " секунд від запуску.");
        }

    }
}
class counterThreadfor5sec extends Thread{
    @Override
    public void run() {
        while(!isInterrupted()){
            try {
                this.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Минуло 5 секунд");
        }
    }
}

