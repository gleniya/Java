package JavaAccentureFinal.module10.activity6;

// 6.4 interface activity class
public class InterfaceActivity {
    // 6.4.1 creating main method
    public static void main(String[] args) {

        //6.4.2 creating object for Bike class to call methods
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        System.out.println("-------------------------");

        // 6.4.3 creating object for car to call methods
        Car car = new Car();
        car.start();
        car.stop();

    }

}
