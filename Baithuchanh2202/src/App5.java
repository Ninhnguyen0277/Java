import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so nguyen duong n");
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            n+=i;
        }
        System.out.println(n);
        sc.close();
    }
}