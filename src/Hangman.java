import java.util.Scanner;


public class Hangman {

	
	public static void main (String [] args) {
	
		System.out.println("Press enter to start");
	
	Scanner s = new Scanner(System.in);
	s.nextLine();
	
	System.out.println("Game starts");
	
	System.out.println(Wordlist.randomWord());
	
	}

	
	
	
	
}
