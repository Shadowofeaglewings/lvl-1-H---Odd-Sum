import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int tc = scanner.nextInt();

		for (int i = 0; i < tc; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a % 2 == 0)
				a += 1;
			if (b % 2 == 0)
				b -= 1;
			int sum = 0;
			for (int j = a; j <= b; j += 2) {
				sum += j;
			}
			System.out.println("Case " + (i + 1) + ": " + sum);
		}

	}

}
