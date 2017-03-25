package anagrams;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverserTest {

	@Test
	public void reverseStringTest() {
		Reverser reverser = new Reverser();
		assertEquals("The string was not reversed as expected(simple):",
				"abcd efgh", reverser.reverseString("dcba hgfe"));
		assertEquals("The string was not reversed as expected(normal):",
				"d1cba hgf!e", reverser.reverseString("a1bcd efg!h"));
		assertEquals("The string was not reversed as expected(hard):",
				"1!@#$345@#$%fd h234!@#$#$gf!e",
				reverser.reverseString("1!@#$345@#$%df e234!@#$#$fg!h"));
	}

	@Test
	public void reverseWordTest() {
		Reverser reverser = new Reverser();
		assertEquals("The word was not reversed as expected(simple):", "abcd",
				reverser.reverseWord("dcba"));
		assertEquals("The word was not reversed as expected(normal):", "d1cba",
				reverser.reverseWord("a1bcd"));
		assertEquals("The word was not reversed as expected(hard):",
				"t12!#@$!@#$432@#$fe32432r2134q",
				reverser.reverseWord("q12!#@$!@#$432@#$re32432f2134t"));
	}
}
