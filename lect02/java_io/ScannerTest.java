package lect02.java_io;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName;

		// Enter username and press Enter
		System.out.println("Enter username: ");
		userName = sc.nextLine();

		System.out.println("Username is: " + userName);
	}
}


