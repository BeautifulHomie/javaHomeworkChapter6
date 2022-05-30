
public class Ch6E_7DieSimulator {

	public static void main(String[] args) {
		
		Die d = new Die(6);
		final int ROLLS = 10;
		
		for (int i = 1; i <= ROLLS; i++)
		{
			int n = d.cast();
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
