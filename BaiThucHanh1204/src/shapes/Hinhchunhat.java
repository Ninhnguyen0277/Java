package shapes;
import java.util.Scanner;
public class Hinhchunhat extends Hinhhoc{
    public float dai;
    public float rong;
    public Hinhchunhat(){
        ten="hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.println("chieu dai= ");
        Scanner sc= new Scanner(System.in);
        dai= sc.nextFloat();
        sc.close();
    }
    public void nhapchieurong(){
        System.out.println("chieu rong= ");
        Scanner sc= new Scanner(System.in);
        rong= sc.nextFloat();
        sc.close();
    }
    public void tinhchuvi(){
        chuvi=2*(dai+rong);
    }
    public void tinhdientich(){
        dientich=dai*rong;
    }
}
