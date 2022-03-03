import java.util.Scanner;

public class App02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n:");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.print("la so chan");
		} else {
			System.out.print("la so le");
		}
		sc.close();
	}
}
