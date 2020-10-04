public class Dogs extends animal{
    String name;
    public Dogs(String name){
        super("janwar");
        this.name = name;
    }


    void bark()
    {
        System.out.println(name + " barks");
    }
    void walk(){
        System.out.println(name);
        super.walk();
        System.out.println(name + " walks");
    }
}
