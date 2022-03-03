import java.util.Scanner;

public class App05 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a;
		int s = 1;
		do {
			System.out.println("nhap so nguyen bat ky");
			a = sc.nextInt();
			s += a;
		} while (s < 100);
		System.out.print("tong cac so nguyen vua nhap=" + s);
		sc.close();
	}

}
