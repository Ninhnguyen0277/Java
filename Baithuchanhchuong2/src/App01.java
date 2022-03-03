import java.util.Scanner;

public class App01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("nhap so thu nhat");
        a = sc.nextInt();
        System.out.println("nhap so thu hai");
        b = sc.nextInt();
        int tong = a + b;
        System.out.println("tong 2 so la" + tong);
        int hieu = a - b;
        System.out.println("hieu 2 so la" + hieu);
        int tich = a * b;
        System.out.println("tich 2 so la" + tich);
        int thuong = a / b;
        System.out.println("thuong 2 so la" + thuong);
        int laydu = a % b;
        System.out.println("lay phan du la" + laydu);
        if (a == b) {
            System.out.println("a va b bang nhau");
        } else if (a > b) {
            System.out.println("a lon hon b");
        } else if (a < b) {
            System.out.println("a nho hon b");
        } else {
            System.out.println("a va b khong bang nhau");
        }
        sc.close();
    }
}
