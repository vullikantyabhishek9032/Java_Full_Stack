package oops_inheritance;

//Inheritance
//hierarchical inheritance

 class Person {
	String name;
	int age;
	char gender;
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
	class Student extends Person{
		int rollnumber;
		double marks;
		String collegename;
		public Student(String name, int age, char gender, int rollnumber, double marks, String collegename) {
			super(name, age, gender);
			System.out.println("Running student class Constructor");
			this.rollnumber = rollnumber;
			this.marks = marks;
			this.collegename = collegename;
		}
	}
public class Employee extends Person{
		int id;
		double salary;
		String desigination;
		public Employee(String name, int age, char gender, int id, double salary, String desigination) {
			super(name, age, gender);
			this.id = id;
			this.salary = salary;
			this.desigination = desigination;
		}
		public static void main(String[] args) {
			System.out.println("main method started");
			Person p1=new Person("hithesh",23,'M');
			System.out.println("================");
			Student s1=new Student("suman",22,'M',211,99.99,"Developer");
			System.out.println("===================");
			Employee e1=new Employee("harsha",20,'M',78892,25000,"Associate Enginner");
			System.out.println("====================");
			System.out.println("Employee name:"+e1.name);
			System.out.println("Employee id:"+e1.id);
			System.out.println("Employee age:"+e1.age);
			System.out.println("Employee gender:"+e1.gender);
			System.out.println("Employee salary:"+e1.salary);
			System.out.println("Employee desiginatio:"+e1.desigination);
			System.out.println("Main method Ended");
			
		}
	}

