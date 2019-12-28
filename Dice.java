import java.lang.Math.*;
class Dice{

	static int throwDie(){
		int num =(int)(Math.random()*6);
		while(num ==0){
			num = (int)(Math.random()*6);
		}
		return num;

	}
}