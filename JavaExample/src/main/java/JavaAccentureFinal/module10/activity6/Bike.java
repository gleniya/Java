package JavaAccentureFinal.module10.activity6;

    // 6.2 class with bike implements the vehicle
    public class Bike implements Vehicle{

        // override start and stop methods from vehicle class
        @Override
        public void start() {
            System.out.println("Bike is starting..");

        }

        @Override
        public void stop() {
            System.out.println("Bike is stopped..!");

        }
    }

