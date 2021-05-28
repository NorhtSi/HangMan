import java.util.Random;

public class Wordlist {


	private static String[] Wordlist = {"haus", "james", "xylophon", "motor", "telefonnummer", "bicycle", "highway", "awesome", "university", "reicht"};
	

	
	public static String randomWord() {
		int rnd = new Random().nextInt(Wordlist.length);
		return Wordlist[rnd];
	}
	
}
