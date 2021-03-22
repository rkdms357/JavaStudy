import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[9];
		int max = 0;
		int count = 0;
		
		for (int i = 0; i < 9; i++) {
			a[i] = scanner.nextInt();

			if (a[i] > max) {
				max = a[i];
				count = i + 1;
			}
		}
		
		scanner.close();
		System.out.print(max + "\n" + count);
	}
}
