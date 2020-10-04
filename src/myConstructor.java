public class myConstructor
{
    public static void main(String[] args) {
        vehicle car = new vehicle(4);
        vehicle scooty = new vehicle(2);
        vehicle auto = new vehicle();
        vehicle car1 = new vehicle(2, 4);

        System.out.println(car.wheels);
        System.out.println(scooty.wheels);
        System.out.println(auto.wheels);
        System.out.println(car1.wheels + " " + car1.headlights);
    }
}

class vehicle{
    int wheels;
    int headlights;
    vehicle()
    {
        wheels=4;
    }
    vehicle(int noOfWheels)
    {
        wheels=noOfWheels;
    }
    vehicle(int headlights, int wheels)
    {
        this.wheels=wheels;
        this.headlights=headlights;
    }
}