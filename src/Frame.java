public class Frame {

	private int firstThrow;
	private int secondThrow;

	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		//to be implemented
		int score;
		score = firstThrow + secondThrow;
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		if(firstThrow==10){

			return true;

		}else{

			return false;
		}
	}

	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if((firstThrow + secondThrow == 10) & (firstThrow != 10)){

			return true;

		}else{

			return false;
		}
	}
}
