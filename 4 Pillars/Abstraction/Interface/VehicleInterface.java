
//Interface - Abstraction

class VehicleInterface {
    public static void main(String[] args) {
        InterfaceCar car = new InterfaceCar();
        car.start();
        car.brake();
        car.stop();
        car.wipe();
    }
}

interface InterfaceVehicle {
    void start();
    void stop();
    void brake();
}
class InterfaceCar implements InterfaceVehicle {
    public void start() {
        System.out.println("Car Started");
    }
    public void stop() {
        System.out.println("Car Stopped");
    }
    public void brake() {
        System.out.println("Car Braked");
    }
    public void wipe() {
        System.out.println("Wipe the window of the car");
    }
}



