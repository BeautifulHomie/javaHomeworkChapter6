import java.util.Scanner;

public class Ch6E_5OneLetterPerLine {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = keyboardIn.next();
		
		for (int i = 0; i < word.length(); i++)
		{
			System.out.println(word.charAt(i));
		}	

	}

}
