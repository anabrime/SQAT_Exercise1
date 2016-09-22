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

		for (int i = 0; i < frames.size() - 1 ; i++) {

			if(frames.get(i).isStrike()){

				bonus = frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow();

			}else if(frames.get(i).isSpare()){

				bonus = frames.get(i+1).getFirstThrow();

			}
		}


		int size = frames.size() - 1;


		if(frames.get(size).isStrike()){

			bonus = frames.get(frames.size()).getFirstThrow() + frames.get(frames.size()).getSecondThrow();
		
		}else if(frames.get(size).isSpare()){
			
			bonus = frames.get(frames.size()).getFirstThrow();
		
		}

	}

	// Returns the game score
	public int score(){
		//to be implemented: should return game score 

		




		return 0;
	}
}
