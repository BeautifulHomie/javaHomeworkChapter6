
public class Ch6E_8Roll100Times {

	public static void main(String[] args) {
		
		Die d = new Die(6);
		final int ROLLS = 100;
		
		for (int i = 1; i <= ROLLS; i++)
		{
			int n = d.cast();
			System.out.printf("%4d", n);
			
				if (i % 10 == 0)
					System.out.println();
		}
		System.out.println();
	}

}
