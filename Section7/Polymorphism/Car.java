public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " is starting!";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating!";
    }

    public String brake() {
        return getClass().getSimpleName() + " is braking!";
    }
}
