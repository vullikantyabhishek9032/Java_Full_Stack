package basicjava;

public class Car {
	
	//Method Chaining
	
	String brand;
	String model;
	String colour;
	int price;
	Car(String brand, String model, String colour, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.price = price;
	}
	float tax()
	{
		float tax=this.price*0.18f;
		return tax;
	}
	void details()
	{
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.colour);
		System.out.println(this.price);
		float t=this.tax();
		System.out.println(t);
		float total=this.price+t;
		System.out.println(total);
	}
	public static void main(String[] args) {
		Car c1=new Car("kia","selts","black",130000);
		c1.details();
	}
}
