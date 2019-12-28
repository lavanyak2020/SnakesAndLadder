
import java.util.*;
public class Board{
	static final int size = 100;
	static ArrayList<Snake> snakesList = new ArrayList<>();
	static ArrayList<Ladder> ladderList = new ArrayList<>();


	static{
		initializeSnakes();
		initializeLadders();
	}

	int checkForSnakes(int position){
		for(int i=0;i<snakesList.size();i++){
			if(snakesList.get(i).isByte(position)){
				return snakesList.get(i).getEndPoint();
			}
		}
		return -1;
	}

	int checkForLadders(int position){
		for(int i=0;i<ladderList.size();i++){
			if(ladderList.get(i).isHit(position)){
				return ladderList.get(i).getEndPoint();
			}
		}
		return -1;
	}

	private static void initializeSnakes(){
		Snake snake = new Snake(16,8);
		snakesList.add(snake);
		snake = new Snake(52,28);
		snakesList.add(snake);
		snake = new Snake(78,25);
		snakesList.add(snake);
		snake = new Snake(99,21);
		snakesList.add(snake);
		snake = new Snake(95,75);
		snakesList.add(snake);
	}

	private static void initializeLadders(){
		Ladder ladder = new Ladder(2,45);
		ladderList.add(ladder);
		ladder = new Ladder(4,27);
		ladderList.add(ladder);
		ladder = new Ladder(9,31);
		ladderList.add(ladder);
		ladder = new Ladder(47,84);
		ladderList.add(ladder);
		ladder = new Ladder(70,87);
		ladderList.add(ladder);
		ladder = new Ladder(71,91);
		ladderList.add(ladder);
	}
}