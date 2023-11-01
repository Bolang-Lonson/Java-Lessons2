/** 1. method must have same name as in the parentclass
    2. method must have same parameter as in the parentclass.
    3. must be IS-A relationship(inheritance).
 */

class Vehicle {
    void run() {System.out.println("Vehicle is running");}
}

class Bike extends Vehicle {
    void run() {System.out.println("Bike is running safely");}

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}