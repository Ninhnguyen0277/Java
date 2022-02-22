import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so nguyen duong a");
        int a= sc.nextInt();
        System.out.println("nhap so nguyen duong b");
        int b= sc.nextInt();
        while(a!=b){
            if(a>b){
            a=a-b;
        }else{
            b=b-a;
        }
        }
        System.out.println("UCLN la" +b);
        sc.close();
    }
}
