package Personal;

import java.util.Scanner;

public class PhuongtrinhBacHai {
    float a,b,c,x1,x2,delta;
    public void nhapheso(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap he so a");
        a=sc.nextFloat();
        System.out.println("nhap he so b");
        b=sc.nextFloat();
        System.out.println("nhap he so c");
        c=sc.nextFloat();
    }
    public void giaiPhuongTrinh(){
        if(a==0){
            if(b==0){
                System.out.print("Phuong trinh vo nghiem");
            }else{
                System.out.print("Phuong trinh co 1 nghiem"+"x="+(-c/b));
            }
        }
    }
    public void inKetQua(){
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }  
}
