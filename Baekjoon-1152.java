import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int n = st.countTokens();
		System.out.println(n);
		
		scanner.close();
		}
	}
