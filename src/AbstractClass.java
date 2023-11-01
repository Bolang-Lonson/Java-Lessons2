/** A class that is declared with abstract keyword is known as abstract class in java. 
 * It can have abstract and non-abstract methods (method with body). It needs to be extended and its method implemented. */

abstract class Bike {
    abstract void run();
}

class Honda extends Bike {
    void run() {System.out.println("running safely...");}

    public static void main(String[] args) {
        Bike obj = new Honda(); // abstract Bike class cannot be instantiated hence use of Honda class
        obj.run();
    }
}