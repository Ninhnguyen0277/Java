import java.util.Scanner;

public class App09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int sokytu = 0;
        System.out.println("Nhap vao chuoi bat ky:");
        chuoi = sc.nextLine();
        for (int i = 0; i <= chuoi.length(); i++) {
            sokytu = chuoi.length();
        }
        System.out.println(sokytu);
        sc.close();
    }

}
