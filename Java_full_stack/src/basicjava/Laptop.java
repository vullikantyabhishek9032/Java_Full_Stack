package basicjava;

public class Laptop {
	
	//Initialization the properties by using object reference
	
	String brand;
	String colour;
	int price;
	
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="HP";
		l1.colour="Grey";
		l1.price=55000;
		System.out.println(l1.brand);
		System.out.println(l1.colour);
		System.out.println(l1.price);
		System.out.println("__________________");
		Laptop l2=new Laptop();
		l2.brand="lenova";
		l2.colour="black";
		l2.price=40000;
		System.out.println(l2.brand);
		System.out.println(l2.colour);
		System.out.println(l2.price);
		
	}

}
