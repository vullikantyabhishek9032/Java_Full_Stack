package basicjava;

public class Pizza {
	
	//Multiple ways for Constructor Overloading
	
	String type="Regular";
	int price=150;
	String toping1;
	String toping2;
	boolean chesse;
	
	//Pizza with no toping cheese optional
	Pizza(boolean c)
	{
		this.chesse=c;
		if(c==true)
		{
			this.price=this.price+80;
		}
	}
	//Pizza with one toping cheese optional
	Pizza(String t1,boolean c)
	{
		this.toping1=t1;
		this.chesse=c;
		this.price=this.price+40;
		if(c==true)
		{
			this.price=this.price+80;
		}
	}
	//Pizza with two toping cheese optional
	Pizza(String t1,String t2,boolean c)
		{
			this.toping1=t1;
			this.toping2=t2;
			this.chesse=c;
			this.price=this.price+70;
			if(c==true)
			{
				this.price=this.price+80;
			}
		}
	void bill()
	{
		System.out.println("type="+this.type);
		System.out.println("toping1="+this.toping1);
		System.out.println("toping2="+this.toping2);
		System.out.println("cheese="+this.chesse);
		float gst=this.price*0.18f;
		float total=this.price+gst;
		System.out.println("GST="+gst);
		System.out.println("Grand_total="+total);
		System.out.println();
	}
	public static void main(String[] args) {
		Pizza p1=new Pizza("Panner","Mushroom",true);
		p1.bill();
		System.out.println("=====================");
		Pizza p2=new Pizza(false);
		p2.bill();
	}
}
