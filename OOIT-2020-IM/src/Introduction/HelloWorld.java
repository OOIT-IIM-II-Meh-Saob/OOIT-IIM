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
		
		
		// VEZBE 2
		// ZADATAK 1
		f = 5;
		sumF = 1;
		int i = 1;
		do {
			sumF = sumF * i;
			i++;
		} while (i <= f);
		System.out.println("Faktorijel broja " + f + " je: " + sumF);
		
		f = 5;
		sumF = 1;
		for (i = 1; i <= f; i++) {
			sumF = sumF * i;
		}
		System.out.println("Faktorijel broja " + f + " je: " + sumF);
		
		// ZADATAK 2
		int brojKorisnika = 5;
		int brojRadnika = 3;
		int brojKasa = 3;
		
		int kaseKojeRade = 0;
		if (brojKorisnika < 10 && brojRadnika < 3) {
			kaseKojeRade = 1;
		}
		// 10 < brojKorisnika < 25
		else if (brojKorisnika >= 10 && brojKorisnika < 25 && brojKasa >= 2){
			kaseKojeRade = 2;
		}
		else if (brojKorisnika >= 25 && brojRadnika > 5 && brojKasa >= 3) {
			kaseKojeRade = 3;
		}
		else {
			kaseKojeRade = brojKasa;
		}
		System.out.println("Trenutno u supermarketu rade:" + kaseKojeRade + " kasa.");
		
		// ZADATAK 3
		for (int j = 99; j >= 10; j = j - 2) {
			System.out.println(j);
		}
		
		int j = 99;
		while (j > 10) {
			if (j % 2 == 1) {
				System.out.println(j);
			}
			j--;
		}
		
		// BREAK and CONTINUE
		for (int l = 0; l < 10; l++) {
			if (l == 6) {
				break;
			}
			System.out.println(l);
		}
		
		for (int l = 0; l < 10; l++) {
			if (l == 6) {
				continue;
			}
			System.out.println(l);
		}
	}
}
