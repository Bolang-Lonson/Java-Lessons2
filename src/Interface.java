/** The interface in java is a mechanism to achieve abstraction. 
 * There can be only abstract methods in the java interface not method body. 
 * It is used to achieve abstraction and multiple inheritance in Java.*/

interface Drawable {
    /*An interface in java is a blueprint of a class. It has static constants and abstract methods */
    void draw(); // draw method here is abstract
}

class Rectangle implements Drawable {
    public void draw() {System.out.println("drawing rectangle");}
}

class Circle implements Drawable {
    public void draw() {System.out.println("drawing circle");}
}

class Interface {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}