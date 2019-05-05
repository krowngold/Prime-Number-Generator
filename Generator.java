import java.util.*;

public class Generator {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime = 1;
		int nextPrime;
		String response;
		System.out.println("Next prime number is: " + prime);
		System.out.println("Do you want another prime number? (yes/no)");
		
		response = scanner.nextLine();
		
//		if (!response.toLowerCase().equals("no") || !response.toLowerCase().equals("yes")) {
//			System.out.println("That isn't a valid response. Please try again (yes/no).");
//			response = scanner.nextLine();
//		}
		
		while (response.toLowerCase().equals("yes")) {
			System.out.println("As you wish...");
			prime = calcNextPrime(prime);
			System.out.println("The next prime number is " + prime);
			System.out.println("Do you want another prime number? (yes/no)");
			response = scanner.nextLine();
		}
		
		System.out.println("Okay...");
		System.out.println("Ending the program.");
	}
	
	public static int calcNextPrime(int oldPrime) {
		//iterate through each number less than half the oldPrime
		//oldPrime modulo each number, if equal to zero store number in oldPrime
		System.out.println("Adding one to old prime.");
		oldPrime++;
//		System.out.println("oldPrime is: " + oldPrime);
		while (isPrime(oldPrime) == false) {
//			System.out.println("In while loop!");
			oldPrime++;
//			System.out.println("oldPrime is now: " + oldPrime);
		}
//		System.out.println("Returning " + oldPrime);
		return oldPrime;
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
