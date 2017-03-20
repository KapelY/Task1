package Tasks;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		String line;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String:");
		line = sc.nextLine();
		
		for (String word : line.split(" ")) {
			char [] charWord = word.toCharArray();
			
			for ( int i = 0, last = word.length() - 1; i < last; ) {
				if ( Character.isLetter(charWord[i]) && Character.isLetter(charWord[last]) ) {
					char temp = charWord[i];
					charWord[i] = charWord[last];
					charWord[last] = temp;
					i += 1;
					last -= 1;
				}
				if ( !Character.isLetter(charWord[i]) ) {
					i += 1;
				}
				if ( !Character.isLetter(charWord[last]) ) {
					last -= 1;
				}
			}
			for ( int i = 0; i < charWord.length; i++ ) {
				System.out.print(charWord[i]);
			}
			System.out.print(" ");
		}
		
		
	}

}
