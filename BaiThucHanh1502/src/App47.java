import java.util.Scanner;

public class App47 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int s=0;
        do{
            System.out.println("nhap so nguyen bat ky");
            int n= sc.nextInt();
            s+=n;
        }while(s<100);
        System.out.println("tong cac so nguyen vua nhap la" +s);
        sc.close();
    }
}