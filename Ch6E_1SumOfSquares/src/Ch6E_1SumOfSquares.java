
public class Ch6E_1SumOfSquares {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < 100; i++)
		{
			sum = sum + i * i;
		}
		System.out.println("The sum is " + sum);
	}

}
