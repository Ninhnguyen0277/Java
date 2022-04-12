package shapes;
import java.util.Scanner;
public class Hinhtron extends Hinhhoc {
    public float bankinh;
    public Hinhtron(){
        ten="Hinh tron";
    }
    public void nhapBanKinh(){
        System.out.println("Ban kinh =");
        Scanner sc=new Scanner(System.in);
        bankinh= sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi= 2*PI*bankinh;
    }
    public void tinhdientich(){
        chuvi= bankinh*PI*bankinh;
    }
}