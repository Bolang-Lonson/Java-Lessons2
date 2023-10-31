/* A subclass includes all of the members of its super class but it cannot access those members of the super class that have been declared as private. Attempt to access a private variable would cause compilation error as it causes access violation.*/

public class Hierarchical {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark() Compile Time error
    }
}

class Animal {
    void eat() {System.out.println("eating...");}
}

class Dog extends Animal {
    void bark() {System.out.println("barking...");}
}

class Cat extends Animal{
    void meow() {System.out.println("meowing...");}
}