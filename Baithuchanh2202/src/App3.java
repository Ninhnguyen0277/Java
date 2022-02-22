import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap  a");
        int a = sc.nextInt();
        int flag = 1;
        if(a<2) return flag =0;
        int i=2;
        while(i<a){
            if(n%i==0){
                flag=0;
                break;
            }
            i++
        }
        return flag;
        }
        sc.close();
    }
}
