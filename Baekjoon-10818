import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int a[] = new int[n];
		int min = 1000000;
		int max = -1000000;
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		
		scanner.close();
		System.out.print(min + " " + max);
	}
}
