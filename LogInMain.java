package SeleniumLoginViaScanner;

import java.util.Scanner;

public class LogInMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LogInHappyPath p1 = new LogInHappyPath();

		LogInSadPath s1 = new LogInSadPath();

		int izbor = 0;

		System.out.println("Unesite jedno od ponuðenog: \n1.Happy Path\n2.Sad Path");

		izbor = sc.nextInt();

		switch (izbor) {

		case 1:
			p1.LogInHappyPath();
			break;

		case 2:
			s1.LogInSadPath();
			break;

		}
sc.close();
	}

}
