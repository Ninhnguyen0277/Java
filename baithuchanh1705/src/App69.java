import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetIntegers=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        treeSetIntegers.add(0);
        treeSetIntegers.add(1);
        treeSetIntegers.add(2);
        treeSetIntegers.add(3);
        treeSetIntegers.add(4);
        treeSetIntegers.add(5);
        treeSetIntegers.add(8);
        System.out.println("cac phan tu trong treeSetinteger:");
        System.out.println(treeSetIntegers);
        System.out.println("nhap phan tu can them:");
        number=sc.nextInt();
        sc.close();
        if (!treeSetIntegers.contains(number)) {
            treeSetIntegers.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phan tu treesetinteger sau khi them:");
            System.out.println(treeSetIntegers);
            
        }else{
            System.out.println("phan tu"+ number +"da ton tai!");
        }
    }
}

