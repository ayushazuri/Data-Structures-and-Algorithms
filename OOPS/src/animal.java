//abstract class animal {
////    String name;
//    abstract void move();
//    abstract void eat();
//
//    void label(){
//        System.out.print("Animal data");
//    }
//}

//interface animal{
//    public void move();
//
//    public void eat();
//
//}

public class animal{
    String name;
    public animal(String name)
    {
        this.name=name;
    }


    void walk() {
        System.out.println(name + " walks");
    }

}