public class encapsulation {
    private String name;
    private int roll_no;

    public String getName(){
       return name;
    }

    public int getRoll_no(){
        return roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRoll_no(int roll_no){
        if(roll_no > 50)
        {
            System.out.println("Not allowed");
            return;
        }
        else
        {
            this.roll_no=roll_no;
        }

    }


}

class encapsulationMain
{
    public static void main(String[] args) {
        encapsulation e = new encapsulation();
        e.setName("Ayush");
        e.setRoll_no(68);
        System.out.println(e.getName());
        System.out.println(e.getRoll_no());
    }
}
