package com.na.collections.map;
public class App107 {
    public static void main(String[] args) {
        TreeMap<Integer,Double> treeMap = new TreeMap<>();
        treemap.put(1, 9d);
        treemap.put(4, 10.1d);
        treemap.put(2, 7.2d);
        treemap.put(8, 10.28d);

        System.out.println("cac phan tu trong treemap: ");
        Set<Map.Entry<Integer,Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        treemap.replace( 4, 20.11d);

        treemap.replace(2, 7.2d, 7.7d);

        System.out.println("cac phan tu co trong treemap sau khi thay the : ");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }
}
