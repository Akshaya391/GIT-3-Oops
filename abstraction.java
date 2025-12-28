abstract class Vehicle {
    abstract void start();   // abstract method

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
    }
}
