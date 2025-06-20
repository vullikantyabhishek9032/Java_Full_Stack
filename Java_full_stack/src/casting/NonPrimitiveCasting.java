package casting;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class NonPrimitiveCasting {
    public static void main(String[] args) {
        // Upcasting
        Animal a = new Dog();  // Dog is upcast to Animal
        a.sound();             // Works fine

        // Downcasting
        Dog d = (Dog) a;       // Animal is downcast to Dog
        d.bark();              // Works fine
    }
}
