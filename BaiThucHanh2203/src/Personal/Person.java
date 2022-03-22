package Personal;

import java.util.Scanner;

public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    public String nhapPerSonID(){
        System.out.print("nhap id:");
        Scanner sc= new Scanner(System.in);
        PersonID=sc.nextLine();
        return PersonID;
    }
    public String nhapPerSonName(){
        System.out.print("nhap ten:");
        Scanner sc=new Scanner(System.in);
        PersonName=sc.nextLine();
        return PersonName;
    }
    public Boolean nhapGender(){
        System.out.print("nhap gender:");
        Scanner sc=new Scanner(System.in);
        Gender=sc.nextBoolean();
        return Gender;
    }
    public String nhapAddress(){
        System.out.print("nhap Address:");
        Scanner sc=new Scanner(System.in);
        PersonID=sc.nextLine();
        sc.close();
        return Address;
    }
}
