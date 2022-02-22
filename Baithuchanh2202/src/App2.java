import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so thuc a");
        int a= sc.nextInt();
        System.out.println("nhap so thuc b");
        int b= sc.nextInt();
        System.out.println("nhap so thuc c");
        int c= sc.nextInt();
        if((a+b>c)||(a+c>b)||(b+c>a)&& (a>0)&& (b>0) &&(c>0) ){
            if(a==b&&c==b){
                System.out.println("Tam giac deu");
            }else if((a==b)||(b==c)||(c==a)){
                System.out.println("Tam giac can");
            }else if((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a)){
                System.out.println("Tam giac vuong");
            }else if((a*a==b*b+c*c)&&(b*b==a*a+c*c)&&(c*c==b*b+a*a)){
                System.out.println("Tam giac vuong can");
            }else{
                System.out.println("Tam giac thuong");
            }
        }
        sc.close();
    }
}