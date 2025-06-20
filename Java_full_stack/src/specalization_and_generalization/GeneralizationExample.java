package specalization_and_generalization;

//Generalized class
class Animal {
 String name;

 Animal(String name) {
     this.name = name;
 }

 void eat() {
     System.out.println(name + " is eating.");
 }

 void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Specialized class 1
class Dog extends Animal {
 Dog(String name) {
     super(name);
 }

 void bark() {
     System.out.println(name + " is barking.");
 }
}

//Specialized class 2
class Cat extends Animal {
 Cat(String name) {
     super(name);
 }

 void meow() {
     System.out.println(name + " is meowing.");
 }
}

//Main class to test generalization
public class GeneralizationExample {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy");
     Cat cat = new Cat("Whiskers");

     // Generalized behavior
     dog.eat();
     dog.sleep();

     cat.eat();
     cat.sleep();

     // Specialized behavior
     dog.bark();
     cat.meow();
 }
}
