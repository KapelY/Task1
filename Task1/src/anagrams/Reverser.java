package anagrams;

import java.util.*;

public class Reverser {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String:");
		System.out.println(reverseString(sc.nextLine()));
	}

	public static String reverseString(String line) {
		StringBuilder buffer = new StringBuilder();
		String [] separatedString = line.split(" ");

		for (String word : separatedString) {
			buffer.append(reverseWord(word) + " ");
		}
		return buffer.toString();
	}

	public static String reverseWord(String word) {
		char[] charWord = word.toCharArray();
		int firstIndex = 0;
		int lastIndex = word.length() - 1;

		for (; firstIndex < lastIndex;) {
			if (Character.isLetter(charWord[firstIndex])
					&& Character.isLetter(charWord[lastIndex])) {
				char currentLetter = charWord[firstIndex];
				charWord[firstIndex] = charWord[lastIndex];
				charWord[lastIndex] = currentLetter;
				firstIndex++;
				lastIndex--;
			}
			if (!Character.isLetter(charWord[firstIndex])) {
				firstIndex++;
			}
			if (!Character.isLetter(charWord[lastIndex])) {
				lastIndex--;
			}
		}
		return new String(charWord);
	}
}
