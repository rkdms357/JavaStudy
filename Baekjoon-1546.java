import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int a[] = new int[n];
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] > max)
				max = a[i];
			sum += a[i];
		}
		scanner.close();
		
		avg = (double)(sum * 100 / max / n);
		System.out.println(avg);
	}
}
