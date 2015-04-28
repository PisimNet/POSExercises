package chap05;
import java.util.*;
public class DotComBust {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom tow = new DotCom();
		tow.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(tow);
		dotComsList.add(three);
		
		System.out.println("you should hit three sites.");
		System.out.println("Pets.com, eToy.com, Go2.com");
		System.out.println("Try to ake as less hits as possible");
		
		for(DotCom dotComToSet : dotComsList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
private void startPlaying(){
	while(!dotComsList.isEmpty()){
		String userGuess = helper.getUserInput("Make your move");
		checkUserGuess(userGuess);
	}
}
private void checkUserGuess(String userGuess){
	numOfGuesses++;
	String result = "miss";
	
	for(DotCom dotComToTest : dotComsList){
		result=dotComToTest.checkYourself(userGuess);
		if (result.equals("hit")){
			break;
		}
		if (result.equals("kill")){
			dotComsList.remove(dotComToTest);
			break;
		}
	}
	System.out.println(result);
}

private void finishGame(){
	System.out.println("All sites are drifting.");
	if (numOfGuesses<=18){
		System.out.println("It has taken you only "+numOfGuesses+"tries.");
		System.out.println("congrats!");
	} else {
		System.out.println("it has taken you to lon time"+numOfGuesses+"tries");
		System.out.println("too baaad.");
	}
}

	public static void main(String[] args) {
       DotComBust game = new DotComBust();
       game.setUpGame();
       game.startPlaying();
	}

}

