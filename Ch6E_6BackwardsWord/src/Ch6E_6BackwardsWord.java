import java.util.Scanner;

public class Ch6E_6BackwardsWord {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = keyboardIn.next();
		
		for (int i = word.length() - 1; i >= 0; i--)
		{
			System.out.print(word.charAt(i));
		}

	}

}
