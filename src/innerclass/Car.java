package innerclass;

public class Car {
    private static int fuel;
    private Engine engine;


    public Car(){
        this.engine = new Engine("V5");
        System.out.println(fuel);
    }

    static class Engine{

        private String engineType;

        public Engine(String engineType){
            this.engineType=engineType;
        }

        public void refuel(){
            System.out.println("Metoda statyczna");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", engine=" + engine +
                '}';
    }
}
