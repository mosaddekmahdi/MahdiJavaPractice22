package questions;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
	
	
	private ArrayList<String> choices;
	
	/** constructs a choice question */
	public ChoiceQuestion() 
	{
		choices = new ArrayList<String>();
	}
	
	/** 
	 * Adds an a answer choice
	 * @param choice is the choice to add
	 * @param correct true if its correct or else its false
	*/
	
	public void addChoice(String choice, boolean correct)
	{
		choices.add(choice);
		if(correct)
		{
			//Converts choice.size(); to string
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}
	

}
