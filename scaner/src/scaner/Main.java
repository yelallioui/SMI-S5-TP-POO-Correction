package scaner;

import java.util.Scanner;

public class Main {
	
	public static int lireInt () {
		int n;
		Scanner scanner = new Scanner(System.in);		
		n = scanner.nextInt();
		return n;
	}

	public Main() {
		
	}

	public static void main(String[] args) {
		int n = lireInt();
		System.out.println(n);

	}

}
