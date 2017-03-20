package Tasks;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		String line, result;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input String:");
		line = sc.nextLine();

		result = reverseString(line);
		System.out.println(result);
	}

	public static String reverseString(String input) {
		String resultString = "";

		for (String word : input.split(" ")) {
			resultString += reverseWord(word) + " ";
		}
		return resultString;
	}

	public static String reverseWord(String word) {
		String resultWord;
		char[] charWord = word.toCharArray();

		for (int front = 0, last = word.length() - 1; front < last;) {
			if (Character.isLetter(charWord[front])
					&& Character.isLetter(charWord[last])) {
				char temp = charWord[front];
				charWord[front] = charWord[last];
				charWord[last] = temp;
				front += 1;
				last -= 1;
			}
			if (!Character.isLetter(charWord[front])) {
				front += 1;
			}
			if (!Character.isLetter(charWord[last])) {
				last -= 1;
			}
		}
		resultWord = String.copyValueOf(charWord);
		return resultWord;
	}
}
