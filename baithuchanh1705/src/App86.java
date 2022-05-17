import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App86 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("CSDL", "co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("JAva", "Java");
        Set<Map.Entry<String,String>> sethashMap=hashMap.entrySet();
        System.out.println("cac en try co trong sethashmap:");
        System.out.println(sethashMap);  
    }
}
