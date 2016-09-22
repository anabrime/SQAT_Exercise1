import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private int bonus;

	public BowlingGame(){}

	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented

		frames.add(frame);
	}

	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented

		for (int i = 0; i < frames.size(); i++) {

			if(frames.get(i).isStrike()){
				bonus = firstThrow + secondThrow;
			}else if(frames.get(i).isSpare()){
				bonus = firstThrow;
			}




			int size = frames.size() - 1;


			if(frames.get(size).isStrike()){

				bonus = firstThrow + secondThrow;	

			}else if(frames.get(size).isSpare()){
				bonus = firstThrow;
			}





		}

		// Returns the game score
		public int score(){
			//to be implemented: should return game score 




		}


		return 0;
	}
}
