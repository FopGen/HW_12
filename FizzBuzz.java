public class FizzBuzz {
    private int counter = 1;
    int value;

    public FizzBuzz(int value) {
        this.value = value;
    }

    public synchronized void fizz() throws InterruptedException {
        while (counter<=value){
            if((counter%3 == 0)&&(counter%5 != 0)){
                System.out.print("fizz, ");
                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    }
    public synchronized void buzz() throws InterruptedException {
        while (counter<=value){
            if((counter%3 != 0)&&(counter%5 == 0)){
                System.out.print("buzz, ");
                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    }
    public synchronized void fizzbuzz() throws InterruptedException {
        while (counter<=value){
            if((counter%3 == 0)&&(counter%5 == 0)){
                System.out.print("fizzbuzz");
                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    } public synchronized void number() throws InterruptedException {
        while (counter<=value){
            if((counter%3 != 0)&&(counter%5 != 0)){
                System.out.print(counter+", ");
                counter++;
                notifyAll();
            }else{
                wait();
            }
        }
    }
}


