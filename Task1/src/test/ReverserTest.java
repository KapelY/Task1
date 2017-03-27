package test;

import static org.junit.Assert.*;

import org.junit.Test;

import anagrams.Reverser;

public class ReverserTest {

	@Test
	public void reverseStringTest1() {
		String actual = "dcba hgfe";
		String expected = "abcd efgh";

		assertEquals(expected, Reverser.reverseString(actual));
	}

	@Test
	public void reverseStringTest2() {
		String actual = "a1bcd efg!h";
		String expected = "d1cba hgf!e";

		assertEquals(expected, Reverser.reverseString(actual));
	}

	@Test
	public void reverseStringTest3() {
		String actual = "1!@#$345@#$%fd h234!@#$#$gf!e";
		String expected = "1!@#$345@#$%df e234!@#$#$fg!h";

		assertEquals(expected, Reverser.reverseString(actual));
	}

	@Test
	public void reverseWordTest1() {
		String actual = "abcd";
		String expected = "dcba";

		assertEquals(expected, Reverser.reverseWord(actual));
	}

	@Test
	public void reverseWordTest2() {
		String actual = "a1bcd";
		String expected = "d1cba";

		assertEquals(expected, Reverser.reverseWord(actual));
	}

	@Test
	public void reverseWordTest3() {
		String actual = "q12!#@$!@#$432@#$re32432f2134t";
		String expected = "t12!#@$!@#$432@#$fe32432r2134q";

		assertEquals(expected, Reverser.reverseWord(actual));
	}
}
