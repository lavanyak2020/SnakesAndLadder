class Snake{
	private int startPoint;
	private int endPoint;
	Snake(int startPoint,int endPoint){
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	int checkBite(int point){
		if(point == startPoint){
			return endPoint;
		}
		return -1;
	}

}