import java.util.Scanner;

public class App08 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        int tb=0;
        System.out.println("nhap so phan tu ");
        n=sc.nextInt();
        int A[]= new int[n];
        System.out.println("nhap cac so nguyen duong ");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            tb = (tb +A[i]);
        }
        tb=tb/n;
        System.out.println("ket qua la" +tb);
            sc.close();
        }

    }
