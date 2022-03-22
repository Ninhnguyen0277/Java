package Personal;

import java.util.Scanner;
import java.util.Date;

public class Sinhvien {
    String Masinhvien;
    String Hoten;
    Boolean Gioitinh;
    String Diachi;
    String Ngaysinh;
    public String nhapMasinhvien(){
        System.out.print("nhap id:");
        Scanner sc=new Scanner(System.in);
        Masinhvien=sc.nextLine();
        return Masinhvien;
    }
    public String nhapHoten(){
        System.out.print("nhap ten:");
        Scanner sc=new Scanner(System.in);
        Hoten=sc.nextLine();
        return Hoten;
    }
    public Boolean nhapGioitinh(){
        System.out.print("nhap gender:");
        Scanner sc=new Scanner(System.in);
        Gioitinh=sc.nextBoolean();
        return Gioitinh;
    }
    public String nhapDiachi(){
        System.out.print("nhap Address:");
        Scanner sc=new Scanner(System.in);
        Diachi=sc.nextLine();
        return Diachi;
    }
    public String nhapNgaysinh(){
        System.out.print("nhap Datetime:");
        Scanner sc=new Scanner(System.in);
        Ngaysinh=sc.nextLine();
        sc.close();
        return Ngaysinh;
    }

}
