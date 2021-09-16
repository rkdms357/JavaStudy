import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int sum = 0, min = N;
		
		for (int i = M; i <= N; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) count++;
			}
		
			if (count == 1) {
				sum += i;
				if (min > i) min = i;
			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		scanner.close();
		}
	}
