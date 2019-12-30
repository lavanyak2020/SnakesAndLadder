import java.util.*;

class Player{
	String name;
	int position;
	private Scanner scan = new Scanner(System.in);
	Player(String name,int position){
		this.name = name;
		this.position = position;
	}

	void setPosition(int position){
		this.position = position;
	}
	
	String getName(){
		return name;
	}
	void goSteps(int count){
		position += count;
	}
	int rollDie(){
		System.out.println("\n\n\t\t*********** Hello, "+name+ " !***********\n\t\t You are at "+position);
		System.out.print("press Enter to throw die:");
		scan.nextLine();
		int value  = Dice.roll();
		System.out.println("\n\n\t\t\t******* Die shows "+value+"********\n");
		
		return value; 
	}
}