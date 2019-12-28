class Ladder{
	private int startPoint;
	private int endPoint;

	Ladder(int startPoint,int endPoint){
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	int getStartPoint(){
		return startPoint;
	}

	int getEndPoint(){
		return endPoint;
	}

	void setStartPoint(){
		this.startPoint = startPoint;
	}

	void setEndPoint(){
		this.endPoint = endPoint;
	}

	boolean isHit(int point){
		if(point == startPoint){
			return true;
		}
		return false;
	}
}