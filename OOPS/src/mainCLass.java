public class mainCLass {
    public static void main(String[] args) {
//        birds b = new birds();
//        fish f = new fish();
//
//        f.eat();
//        f.move();
//        b.eat();
//        mainCLass mc = new mainCLass();
//        mc.check(b);

//        fish f = new fish();
//        f.move();
//        f.eat();
//        f.fly();
//
//        System.out.println(f.noOfLegs);
//        System.out.println(f.outerCovering);
//
        Dogs dog = new Dogs("kutta");
        Cats cat = new Cats("Billi");

        cat.meow();
        cat.walk();
        System.out.println(dog.name);

        dog.bark();
        dog.walk();

    }
}
