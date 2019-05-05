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
		System.out.println("Adding one to old prime.");
		oldPrime++;
		while (isPrime(oldPrime) == false) {
			oldPrime++;
		}
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
