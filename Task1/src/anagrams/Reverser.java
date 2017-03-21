package anagrams;

import java.util.*;

public class Reverser {
	public static void main(String[] args) {
		String line, result;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input String:");
		line = sc.nextLine();

		result = reverseString(line);
		System.out.println(result);
	}

	public static String reverseString(String line) {
		String resultString = "";

		for (String word : line.split(" ")) {
			resultString += reverseWord(word) + " ";
		}
		return resultString;
	}

	public static String reverseWord(String word) {
		String resultWord;
		char[] charWord = word.toCharArray();

		for (int firstIndex = 0, lastIndex = word.length() - 1; firstIndex < lastIndex;) {
			if (Character.isLetter(charWord[firstIndex])
					&& Character.isLetter(charWord[lastIndex])) {
				char temp = charWord[firstIndex];
				charWord[firstIndex] = charWord[lastIndex];
				charWord[lastIndex] = temp;
				firstIndex += 1;
				lastIndex -= 1;
			}
			if (!Character.isLetter(charWord[firstIndex])) {
				firstIndex += 1;
			}
			if (!Character.isLetter(charWord[lastIndex])) {
				lastIndex -= 1;
			}
		}
		resultWord = String.copyValueOf(charWord);
		return resultWord;
	}
}
