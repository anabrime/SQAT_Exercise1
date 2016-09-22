import java.util.ArrayList;
import java.util.List;

//Finish time: 16:49
//ID: 120

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame(){}

	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented

		frames.add(frame);
	}

	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented

		

	}

	// Returns the game score
	public int score(){
		//to be implemented: should return game score 

		int bonus = 0; 
		
		for (int i = 0; i < frames.size(); i++) {

			if(frames.get(i).isStrike() && (i < frames.size() - 1)){

				bonus = frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow() + frames.get(i).score() ;

			}else if(frames.get(i).isSpare() && (i < frames.size() - 1)){

				bonus = frames.get(i+1).getFirstThrow() + frames.get(i).score();

			}else if(frames.get(i).isStrike() || frames.get(i).isSpare()){
				
				bonus = frames.get(frames.size()).getFirstThrow()+ frames.get(i).score();
			
			}
		}

		return bonus;
	}
}
