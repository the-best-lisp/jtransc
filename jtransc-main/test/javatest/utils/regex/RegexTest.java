package javatest.utils.regex;

import com.jtransc.io.JTranscConsole;

import java.util.regex.Pattern;

public class RegexTest {
	static public void main(String[] args) {
		stringMatchesTest();
		stringReplaceAllTest();
		regexMatchesTest();
		replaceTest();
	}

	static private void regexMatchesTest() {
		Pattern NUMERIC = Pattern.compile("[-]?[0-9]+");
		System.out.println(NUMERIC.matcher("1").matches());
		System.out.println(NUMERIC.matcher("1.0").matches());
		System.out.println(NUMERIC.matcher("1.1").matches());
		System.out.println(NUMERIC.matcher("-1.1").matches());
		System.out.println(NUMERIC.matcher("1.1").find());
		//System.out.println(NUMERIC.matcher("1.1").group());
	}

	static public void stringMatchesTest() {
		JTranscConsole.log("StringsTest.matchesTest:");
		System.out.println("hello".matches(".*el+.*"));
		System.out.println("hello".matches("el+"));
		System.out.println("hello".matches("ell"));
		System.out.println("hello".matches(".*ell"));
		System.out.println("hello".matches("elll"));
		System.out.println("hello".matches(".*ell.*"));
	}

	private static void stringReplaceAllTest() {
		System.out.println("StringsTest.replaceAllTest:");
		System.out.println("\\\\hello\\\\world".replaceAll("\\\\", "/"));
		System.out.println("\\\\hello\\\\world".replaceFirst("\\\\", "/"));
	}

	static private void replaceTest() {
		System.out.println(Pattern.compile("l").matcher("hello").replaceAll("_"));
		System.out.println(Pattern.compile("l").matcher("hello").replaceFirst("_"));
	}
}
