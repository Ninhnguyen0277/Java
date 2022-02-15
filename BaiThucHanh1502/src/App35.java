import java.util.Scanner;

public class App35 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so thu nhat");
        int a= sc.nextInt();
        System.out.println("nhap so thu hai");
        int b=sc.nextInt();
        if(a<b){
            System.out.println("so nho nhat la" +a);
        }else{
            System.out.println("so nho nhat la" +b);
        }
        sc.close();
    }
}