import java.util.Scanner;

public class App06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        float gt = 1;
        System.out.println("nhap mot so nguyen duong");
        n = sc.nextInt();
        if (n == 0 && n == 1) {
            System.out.println("giai thua cua" + n + "la" + 1);
        } else {
            for (int i = 2; i <= n; i++) {
                gt *= i;
            }
        }
        System.out.println("Giai thua cua" + n + "la" + gt);
        sc.close();
    }
}
