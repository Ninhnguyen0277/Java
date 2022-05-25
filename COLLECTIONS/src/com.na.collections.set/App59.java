package com.na.collections.set;
public class App59 {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
    
        for(String str : linkedHashSet) {
          System.out.println(str);
        }
    }
}
