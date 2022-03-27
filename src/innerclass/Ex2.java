package innerclass;

public class Ex2 {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine("V5");
        engine.refuel();


        Car car = new Car();
        engine.refuel();

        System.out.println(car.toString());

    }
}
