
import java.util.*;
public class Board{
	static final int size = 100;
	private static ArrayList<Snake> snakesList = new ArrayList<>();
	private static ArrayList<Ladder> ladderList = new ArrayList<>();


	static{
		initializeSnakes();
		initializeLadders();
	}

	Snake checkForSnakes(int position){
		for(Snake snake : snakesList){
			int snakeEndPoint = snake.checkBite(position);
			if(snakeEndPoint != -1){
				return snake;
			}
		}
		return null;
	}

	Ladder checkForLadders(int position){
		for(Ladder ladder : ladderList){
			int ladderEndPoint = ladder.checkHit(position);
			if(ladderEndPoint != -1){
				return ladder;
			}
		}
		return null;
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