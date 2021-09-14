import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int money = 0;
		int max = 0;
		
		if (a == b && a == c && b == c)
			money = 10000 + a * 1000;
		else if (a == b || a == c)
			money = 1000 + a * 100;
		else if (b == c)
			money = 1000 + b * 100;
		
		else {
			if (a > b && a > c)
				max = a;
			else if (b > a && b > c)
				max = b;
			else if (c > a && c > b)
				max = c;
			
			money = max * 100;
		}
		
		System.out.print(money);
		}
	}
