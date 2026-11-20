package JavaAccentureFinal.module10.activity6;

// class car implements the vehicle
public class Car implements Vehicle {

    // override the start and stop class
    @Override
    public void start() {
        System.out.println("Car is starting..");

    }

    @Override
    public void stop() {
        System.out.println("Car has stopped..!");

    }
}
