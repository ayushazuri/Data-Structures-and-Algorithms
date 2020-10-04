public class Cats extends animal{
    String name;
    public Cats(String name)
    {
        super("non-human");
        this.name = name;
    }
    void meow()
    {
        System.out.println(name + " meows");
    }
    void walk(){
        super.walk();
        System.out.println(name + " walks");
    }
}
