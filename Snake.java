class Snake{
	private int startPoint;
	private int endPoint;
	Snake(int startPoint,int endPoint){
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	int getStartPoint(){
		return startPoint;
	}

	int getEndPoint(){
		return endPoint;
	}

	void setStartPoint(int startPoint){
		this.startPoint = startPoint;
	}

	void setEndPoint(int endPoint){
		this.endPoint = endPoint;
	}

	boolean isByte(int point){
		if(point == startPoint){
			return true;
		}
		return false;
	}

}