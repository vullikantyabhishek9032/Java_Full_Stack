package oops_encapsulation;

public class Employee_Encapsulation {
	
	private int id;
	private String name;
	private double salary;
	public Employee_Encapsulation(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee_Encapsulation e1=new Employee_Encapsulation(52276696,"Rohit",28500.00);
		System.out.println("main method started");
		//printing the properties by using to get method
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println("========================");
		//Updating the properties using get method
		System.out.println("updated salary");
		e1.salary=45000.00;
		System.out.println(e1.getSalary());
		System.out.println("main method ended");
	}

}
