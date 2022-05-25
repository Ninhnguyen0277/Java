package com.na.collections.set;
public class App68 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        treeSetInteger.remove(0);
        System.out.println("Cac phan tu trong treeInteger");
        System.out.println(treeSetInteger);
        System.out.println("Nhap cac phan tu can them");
    
        number = scanner.nextInt();
        if(!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
          System.out.println("Them thanh cong");
          System.out.println("Cac phan tu trong treeInteger sau khi them: ");
          System.out.println(treeSetInteger);
    
        } else {
          System.out.println("Phan tu " +number+ "da ton tai!" );
          sc.close();
        }
    }
}
