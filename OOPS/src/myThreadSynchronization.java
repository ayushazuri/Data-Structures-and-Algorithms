public class myThreadSynchronization {
    public static void main(String[] args) throws InterruptedException{
        counter obj = new counter();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<1000;i++){
                    obj.increment();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        });

        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println(obj.count);
    }
}
class counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
