package questions;
import java.util.Scanner;
public class QuestionMain1 {
	public static void main(String[] args) {	
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		Question q = new Question();
		
		q.setText("Who was the invent"
				+ "or of Java");
		q.setAnswer("James Gosling");
		
		q.display();
		System.out.println("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
		
	}
}
