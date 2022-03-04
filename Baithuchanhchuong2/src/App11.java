import java.util.Scanner;

public class App11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,t;
        System.out.println("nhap tong so phan tu trong mang");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("nhap cac phan tu trong mang A");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("ket qua mang ban dau la");
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
        for(int i=1;i<n;i++){
            for(int j=n-1;j>=i;j--){
                if(A[j-1]>A[j]){
                    t=A[j-1];
                    A[j-1]=A[j];
                    A[j]=t;
                }
            }
        }
        System.out.println("ket qua mang sau khi thay doi la");
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
        sc.close();
    }

}
