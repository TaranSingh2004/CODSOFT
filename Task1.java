import java.util.*;
public class Task1{
	public static void guessingNumber()
	{
		Scanner sc = new Scanner(System.in);
		Random rand=new Random();
		
		//creating a random number by using nextDouble() which creates number between 0.0 to 1.0
		
        int num=(int)(100*rand.nextDouble());
		System.out.println("This game is called Guess the number");
		System.out.println("Please enter the number of trials u needed: ");
		
		//number of trials
		
		int x = sc.nextInt();
		int i, guess;
		System.out.println("A number is chosen between 1 to 100.");
		for (i = 0; i < x; i++) {
			System.out.println("Guess the number:");
			
			//number is guessed by the user
			
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (number > guess && i != x - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (number < guess && i != x - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}
		
		//if u r out of moves
		
		if (i == x) {
			System.out.println("You have completed all ur tries.....");
			System.out.println("The number was " + number);
		}
	}
	public static void main(String arg[])
	{
		guessingNumber();
	}
}