package com.na.collections.set;
import java.util.HashSet;
import java.util.Scanner;
public class App55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetStrings.add("Wilson");
        hashSetStrings.add("Nike");
        hashSetStrings.add("Volvo");
        hashSetStrings.add("Kia");
        hashSetStrings.add("Lenovo");
        hashSetStrings.add("Lenovo");
    
        System.out.println("Cac phan tu trong hashSet:");
        System.out.println(hashSetStrings);
        System.out.println("Nhap phan tu can xoa");
        name = sc.next();
    
        if (hashSetStrings.contains(name)) {
          hashSetStrings.remove(name);
          System.out.println("Xoa thanh cong!");
          System.out.println("Cac phan tu con lai trong hashSet");
          System.out.println(hashSetStrings);
        } else {
          System.out.println("xOA KHONG THANH CONG");
        }
        sc.close();
    }

}
