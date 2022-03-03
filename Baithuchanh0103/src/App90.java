import java.util.Scanner;

public class App90 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String chuoi;
        char kitu;
        System.out.println("nhap vao chuoi bat ky");
        chuoi=sc.nextLine();
        System.out.println("cac ky tu co trong chuoi la");
        for(int i=0;i<chuoi.length();i++){
            //tra ve ky tu tai vi tri thu i trong chuoi va gan vao cho bien ky tu
            //i chay tu 0 den vi tri do dai cua chuoi-1
            kitu=chuoi.charAt(i);
            System.out.println(kitu);
        }
                sc.close();
    }
}