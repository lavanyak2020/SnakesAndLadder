import java.util.*;


public class SnakesAndLadder{
	private Board board;
	private Player[] players;
	private int no_of_players;
	Scanner scan = new Scanner(System.in);
	void gameSetUp(){
		board = new Board();
		getPlayers();
		
	}

	private boolean isPlayerWin(Player player){
		if(player.position == board.size){
			return true;
		}
		return false;
	}

	private void getPlayers(){
		System.out.print("Enter no. of players");
		no_of_players = scan.nextInt();
		players = new Player[no_of_players];
		for(int i=0;i<no_of_players;i++){
			System.out.print("Enter player name:");
			String name = scan.next();
			players[i] = new Player(name,0);
		}
		scan.nextLine();
	}

	private boolean isPossibleSteps(Player player,int steps){
		if(player.position + steps > 100){
			return false;
		}
		return true;
	}
	private void checkInBoard(int playerNum){
		int toStep = board.checkForSnakes(players[playerNum].position);
		if(toStep != -1){
			System.out.println("\t\t\t~~~~~~~~~~~~~^,^ Snake Bit");
			players[playerNum].setPosition(toStep);	
		}else{
			toStep = board.checkForLadders(players[playerNum].position);
			if(toStep != -1){
				System.out.println("\t\t\t/-/\n\t\t\t/-/\n\t\t\t/-/\n\t\t\t/-/\n\t\t\t/-/ \tLadder\n\t\t\t/-/\n\t\t\t/-/\n\t\t\t/-/\n\t\t\t/-/\n\t\t\t");
				players[playerNum].setPosition(toStep);
			}
		}
	}
	void startGame(){
		boolean isAnyoneWin = false;
		while(!isAnyoneWin){	
			for(int i=0;i<no_of_players;){
				  int value = players[i].rollDie();
				  loadingTime(1000l);
				  boolean possible = isPossibleSteps(players[i],value);
				  if(!possible){
				  	System.out.println("\n\t\tYou are still in "+players[i].position);
				  	continue;
				  }
				  players[i].goSteps(value);
				  checkInBoard(i);
				  System.out.println("\n\t\t\tNow, you are at "+players[i].position);
				  isAnyoneWin = isPlayerWin(players[i]);
				  if(isAnyoneWin){
				  	System.out.println(players[i].name +" Won the game.");
				  	break;
				  }

				  if(value != 6  || (!possible && value == 6)){
				  	i++;
				  }
				  loadingTime(3000l);
			}

		}
	}
	private void loadingTime(long waitTime) {
	    long getCurrentTimeInMilSec = System.currentTimeMillis();
	    long setEndTime = getCurrentTimeInMilSec + waitTime;
	    while (setEndTime > System.currentTimeMillis()) {

	    }

    }
	
}