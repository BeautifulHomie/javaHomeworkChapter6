import java.util.Scanner;

public class Ch6E_3VowelUnderscore {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Please enter a word or multiple words with no spaces: ");
		String userWord;
		userWord = keyboardInput.next();
		
		for (int n = 0; n < userWord.length(); n++)
		{
			char ch = userWord.charAt(n);
			
			if (ch == 'a' || ch == 'A' 
			   || ch == 'e' || ch == 'E' 
			   || ch == 'i' || ch == 'I' 
			   || ch == 'o' || ch == 'O' 
			   || ch == 'u' || ch == 'U')
			{
				System.out.print('_');
			}
			else
			{
				System.out.print(ch);
			}
		}

	}

}
