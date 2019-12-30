class Ladder{
	private int startPoint;
	private int endPoint;

	Ladder(int startPoint,int endPoint){
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	int checkHit(int point){
		if(point == startPoint){
			return endPoint;
		}
		return -1;
	}
}