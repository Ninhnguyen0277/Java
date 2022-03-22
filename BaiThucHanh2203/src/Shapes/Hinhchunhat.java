package Shapes;

import java.util.Scanner;

public class Hinhchunhat {
    float a;
    float b;
    float cv;
    float dt;
    public void nhapchieudai(){
        System.out.println("Hay nhap chieu dai hinh chu nhat:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        sc.close();
    }
    public void nhapchieurong(){
        System.out.println("Hay nhap chieu rong hinh chu nhat:");
        Scanner sc=new Scanner(System.in);
        b=sc.nextFloat();
        sc.close();
    }
    public float tinhchuvi(){
        cv=(a+b)/2;
        return cv;
    }
    public float tinhdientich(){
        dt=a*b;
        return dt;
    }
}
