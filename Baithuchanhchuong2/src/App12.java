import java.util.Scanner;

public class App12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("nhap so dong cua ma tran");
        m=sc.nextInt();
        System.out.println("nhap so cot cua ma tran");
        n=sc.nextInt();
        int A[][]=new int[m][n];
        System.out.println("nhap cac phan tu trong mang A");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("A["+i+"]["+j+"]=");
                A[i][j]=sc.nextInt();
            }
        }
        int max=A[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max<A[i][j]){
                    max=A[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong ma tran la" +max);
        sc.close();
    }

}
