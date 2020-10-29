package Introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// Ovo je komentar
		System.out.println("Hello, World!");
		
		// PROMENLJIVE
		int firstNumber = 2;
		long secondNumber = 4;
		
		long sum = firstNumber + secondNumber;
		
		double thirdNumber = 2.5;
		
		char c = ' ';
		String firstName = "Petar";
		String lastName = "Petrovic";
		
		System.out.println("Student: " + firstName + c + lastName);
		
		boolean bool = false;
		
		
		// USLOVI
		int a = 24;
		int b = 12;
		int result = 0;
		char operation = 'p';
		
		if (operation == '+') {
			result = a + b;
			System.out.println("Krajnji rezultat je: " + result);
		}
		else if (operation == '-') {
			if (a > b) {
				result = a - b;
				System.out.println("Krajnji rezultat je: " + result);
			} else {
				result = b - a;
				System.out.println("Krajnji rezultat je: " + result);
			}
		}
		else if (operation == '*') {
			result = a * b;
			System.out.println("Krajnji rezultat je: " + result);
		}
		else if (operation == '/') {
			result = a / b;
			System.out.println("Krajnji rezultat je: " + result);
		}
		else {
			System.out.println("Nezeljeni karakter!");
		}
		
		
		// PETLJE
		int f = 5;
		int sumF = 1;
		while (f > 0) {
			sumF = sumF * f;
			f--;
		}
		System.out.println("Faktorijel broja 5 je: " + sumF);
	}
}
