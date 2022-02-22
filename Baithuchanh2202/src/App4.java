import java.text.BreakIterator;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so nguyen duong n");
        int n= sc.nextInt();
        int i=0,a;
        while(i<n){
            a=i;
            if(a==1)System.out.println(i+"");
            ++i;
        }
        int flag=1;
        if(n<2) return flag =0;
        int i=2;
        while(i<n){
            if(n%i==0){
                flag=0;
                break;
            }
            i++;
        }return flag;
        sc.close();
    }
}
