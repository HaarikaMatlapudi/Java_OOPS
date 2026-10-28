
//Abstraction

class Vehicle{
    public static void main(String args[]){
        Car c=new Car();
        Bike b=new Bike();
        System.out.println("Functionalities of a Car");
        c.start();
        c.stop();
        c.wipe();
        System.out.println("Functionalities of a Bike");
        b.start();
        b.stop();
        b.brake();
    }
}

abstract class AbstractVehicle{
    public abstract void start();
    public abstract void stop();
    public abstract void brake();
}

class Car extends AbstractVehicle{
    @Override
    public void start(){
        System.out.println("Car Started");
    }
    @Override
    public void stop(){
        System.out.println("Car Stopped");
    }
    @Override
    public void brake(){
        System.out.println("Brake");
    }
    public void wipe(){
        System.out.println("Wipe the window of the car");
    }
}

class Bike extends AbstractVehicle{
    @Override
    public void start(){
        System.out.println("Bike Started");
    }
    @Override
    public void stop(){
        System.out.println("Bike Stopped");
    }
    @Override
    public void brake(){
        System.out.println("Brake");
    }
}

