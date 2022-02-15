import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("nhap so nguyen duong");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int tongcacchuso=0,cacsochuso;
        cacsochuso=n;
        while(cacsochuso!=0){
            tongcacchuso+=cacsochuso%10;
            cacsochuso=cacsochuso/10;
        }
        sc.close();
        System.out.println("tong so cac chu so nguyen duong la "+ tongcacchuso);
    }
}
