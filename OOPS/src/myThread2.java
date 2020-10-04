import javax.swing.plaf.TableHeaderUI;

public class myThread2 {
    public static void main(String[] args) throws InterruptedException{
        Runnable ob1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for(int i=0;i<10;i++)
                {
                    System.out.println(i+" "+Thread.currentThread().getPriority()+" ");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable ob2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for(int i=0;i<10;i++)
                {
                    System.out.println(i+" "+Thread.currentThread().getPriority()+" ");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1 = new Thread(ob1, "First Thread");
        Thread t2 = new Thread(ob2, "Second Thread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.getName());
        System.out.println(t2.getName());

    }
}
