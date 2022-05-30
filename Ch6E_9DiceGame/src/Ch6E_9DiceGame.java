import java.util.Random;

public class Ch6E_9DiceGame {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int num;
		int balance = 20;
		
		for (int i = 0; i < 20; i++)
		{
			balance -= 1;
			num = 1 + generator.nextInt(6);
			System.out.println("Your roll is: " + num);
			
			switch(num)
			{
			case 1:
				
				balance += 4;
				break;
				
			case 2:			
			case 3:			
			case 4:
			case 5:
			
				break;
				
			case 6:
				
				balance += 3;
			}
		}
		
		System.out.println("Your balance is: " + balance);
	}

}
