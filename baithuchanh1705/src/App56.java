import java.util.Scanner;
import java.util.HashSet;
public class App56{
     public static void main(String[] args){
        String name;
        HashSet<String> hashSetStrings=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        hashSetStrings.add("Wilson");
        hashSetStrings.add("nike");
        hashSetStrings.add("volvo");
        hashSetStrings.add("KIA");
        hashSetStrings.add("levono");
        hashSetStrings.add("levono");
        System.out.println("cac phan tu trong hashSetString:");
        System.out.println(hashSetStrings);
        System.out.println("nhap phan tu can xoa:");
        name=sc.nextLine();
        sc.close();
        if (hashSetStrings.contains(name)) {
            hashSetStrings.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu con lai trong hashSetString:");
            System.out.println(hashSetStrings);
        }else{
            System.out.println("xoa ko thanh cong!");
        }


    }
}