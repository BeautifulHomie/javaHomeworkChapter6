import java.util.Scanner;

public class Ch6_2CumulativeTotals {

	public static void main(String[] args) {
		
		double sum = 0.0;
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Please enter a series of numbers: ");
		double input;
		
		while(keyboardInput.hasNextDouble())
		{
			input = keyboardInput.nextDouble();
			sum = sum + input;
			System.out.println(sum + " ");
		}

	}

}
