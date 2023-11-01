/**
 *  1. super can be used to refer immediate parent class      instancevariable.
    2. super can be used to invoke immediate parent classmethod.
    3. super() can be used to invoke immediate parent classconstructor.
 */

class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color); // prints color of Dog class
        System.out.println(super.color); // prints color of Animal class
    }
}

class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}