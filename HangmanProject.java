import java.util.Scanner;
import java.util.StringTokenizer;

public class ClassWork
{
	public static void main(String[] args)
	{
		String phraseList[] = {"cats and dogs", "stephen curry", "joe programmer", "words can be critical", "alexander the great", "anticonstitutional", "airplanes", "boats", "theatre", "cinema"};
		int wordChoice = (int)(Math.random() * 9);
		String phrase = phraseList[wordChoice];
		System.out.println(phrase);
	}
}
