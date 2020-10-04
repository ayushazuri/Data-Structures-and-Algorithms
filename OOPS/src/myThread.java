public class myThread {

    public static void main(String[] args) throws InterruptedException {



//        Thread t1 = Thread.currentThread();
//        System.out.println(t1.getName());
//        System.out.println(t1.getPriority());
//        System.out.println("Thread name: " + t1);
//        t1.setName("Ayush singh");
//        System.out.println("Thread name: " + t1);
//        System.out.println(t1.getName());

        ex ob1 = new ex();
        ex1 ob2 = new ex1();
        ob1.start();
        ob2.start();
        ob1.join();
        ob2.join();
        System.out.println(ob1.getName());
        System.out.println(ob2.getName());

        exR ob3 = new exR();
        exR2 ob4 = new exR2();
        Thread t2 = new Thread(ob3);
        Thread t3 = new Thread(ob4);

        //Thread t2 = new Thread(new exR());

        t2.start();
        t3.start();

    }
}
class ex extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    void print(){
        for(int i=10;i<20;i++){
            System.out.println(i);
        }
    }
}

class ex1 extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class exR implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class exR2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
