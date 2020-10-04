public class InterThread_Communication {
    public static void main(String[] args) {
        Customer c = new Customer();

        new Thread(){
            @Override
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                c.deposit(5000);
            }
        }.start();

    }
}

class Customer{
    int amount = 10000;

    synchronized void withdraw(int amount){
        if(this.amount < amount){
            System.out.println("Less Balance. Waiting.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("Waiting is over. Withdraw is over.");
    }

    synchronized void deposit(int amount){
        System.out.println("Going to add money. Notifying process will start.");
        this.amount += amount;
        notify();

    }
}
