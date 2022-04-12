import java.util.Scanner;

public class App81 {
    public static void main(String[] args) throws Exception {
        //khai bao so dong va so cot cua ma tran
        Scanner sc= new Scanner(System.in);
        int m,n;
        System.out.println("nhap vao so dong cua ma tran:");
        m=sc.nextInt();
        System.out.println("nhap vao so cot cua ma tran");
        n=sc.nextInt();
        //khai bao ma tran X co m dong n cot
        int X[][]= new int[m][n];
        System.out.println("Nhap cac phan tu trong ma tran");
        for(int i=0;i<m;i++){
            for(int j=0;i<n;i++){
                System.out.println("X[+i+][+j+]=" );
                X[i][j]=sc.nextInt();
            }
        }
        int max=X[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max<X[i][j]){
                    max=X[i][j];
                }
            }
            System.out.println("phan tu lon nhat trong ma tran la"+max);
        }
        sc.close();
        }
    }
