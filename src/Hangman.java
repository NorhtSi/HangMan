import java.util.Scanner;


public class Hangman {

	
	public static void main (String [] args) {
	
		System.out.println("Press enter to start");
	
	Scanner s = new Scanner(System.in);
	s.nextLine();
	
	System.out.println("Game starts");
	
	String Wort = Wordlist.randomWord();
	
	int L�nge = Wort.length(); 
	
	String nothing = "" ;
	
	for (int i=0; i<L�nge; i++) {
		nothing += "_ ";
	}
	System.out.println (nothing);
	
	}

	
	
	
	
}
