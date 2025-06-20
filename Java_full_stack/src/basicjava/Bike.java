package basicjava;

public class Bike {
	
	//Initialize the property using non-static block
	
	String name;
	int price;
	//BLOCK
	{
		this.name="2900";
		this.price=1245000;
	}
	public static void main(String[] args) {
		Bike b1=new Bike();
		System.out.println(b1.name);
		System.out.println(b1.price);
		Bike b2=new Bike();
		System.out.println(b2.name);
		System.out.println(b2.price);
	}

}
