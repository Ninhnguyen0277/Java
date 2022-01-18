import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap he so a = ");
         a = sc.nextFloat();
        System.out.print("Nhap he so b = ");
         b = sc.nextFloat();
        System.out.print("Nhap hang so c = ");
         c = sc.nextFloat();
         if(a==0){
             if(b==0){
                 System.out.println("phuong trinh vo nghiem");
             }else{
                 System.out.println("phuong trinh co nghiem la:" + "x =" + (-c/b));
             }
         }
         delta=b*b-4*a*c;
         if(delta<0){
             System.out.println("phuong trinh vo nghiem");
         }else if(delta==0){
             System.out.println("phuong trinh co nghiem duy nhat"+(-b/(2*a)));
         }
         else {
             x1=(-b+Math.sqrt(delta))/2*a;
             x2=(-b-Math.sqrt(delta))/2*a;
             System.out.println("phuong trinh co 2 nghiem la"+ "x1="+x1+ "x2="+x2);
         }
        }
    }
