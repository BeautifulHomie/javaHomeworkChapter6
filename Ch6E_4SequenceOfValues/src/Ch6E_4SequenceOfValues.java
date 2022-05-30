import java.util.Scanner;

public class Ch6E_4SequenceOfValues {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		System.out.println("Please enter a set of floatin-point values. "
		+ "Enter any value other than a number to indicate the end of the "
		+ "sequence.");
		
		boolean first = true;
		double smallest = 0;
		double biggest = 0;
		double sum = 0.0;
		
		int numberOfValues = 0;
		
		while(keyboardIn.hasNextDouble())
		{
			double value = keyboardIn.nextDouble();
			numberOfValues++;
			
			if(first)
			{
				smallest = value;
				biggest = value;
				sum = value;
				first = false;
			}
			else
			{
				if (value < smallest)
				{
					smallest = value;
				}
				if (value > biggest)
				{
					biggest = value;
				}
				sum += value;
			}
		}
		
			System.out.printf("The average of all the values is: %.2f%n", sum/numberOfValues);
			System.out.printf("The smallest values is: %.2f%n", smallest);
			System.out.printf("The largest value is: %.2f%n", biggest);
			System.out.printf("The range of the values is: %.2f%n", biggest - smallest);
			
	}

}
