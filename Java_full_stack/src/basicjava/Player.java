package basicjava;

public class Player {
	
	//Constructor
	
	String name;
	int jerseryno;
	String team;
	Player(String name, int jerseryno, String team) {
		super();
		this.name = name;
		this.jerseryno = jerseryno;
		this.team = team;
	}
	public static void main(String[] args) {
		Player p1=new Player("kohil",18,"RCB");
		Player p2=new Player("Dhoni",7,"CSK");
		System.out.println(p1.name);
		System.out.println(p1.jerseryno);
		System.out.println(p1.team);
		System.out.println(p2.name);
		System.out.println(p2.jerseryno);
		System.out.println(p2.team);
	}
	
	

}
