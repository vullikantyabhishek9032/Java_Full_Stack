package specalization_and_generalization;

//General class
class Employee {
 String name;
 int id;

 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 void work() {
     System.out.println(name + " is working.");
 }
}

//Specialized class
class Manager extends Employee {
 Manager(String name, int id) {
     super(name, id);
 }

 void conductMeeting() {
     System.out.println(name + " is conducting a meeting.");
 }
}

//Another specialized class
class Developer extends Employee {
 Developer(String name, int id) {
     super(name, id);
 }

 void writeCode() {
     System.out.println(name + " is writing code.");
 }
}

//Main class to test specialization
public class SpecializationExample {
 public static void main(String[] args) {
     Manager m = new Manager("Alice", 101);
     Developer d = new Developer("Bob", 102);

     m.work();             // Inherited method
     m.conductMeeting();   // Specialized method

     d.work();             // Inherited method
     d.writeCode();        // Specialized method
 }
}
