package Heritage;

public class Hangar {

    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        Boat boat = new Boat("Titanic");

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
