class Player{
	String name;
	int position;
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
}