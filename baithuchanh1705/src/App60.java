import java.util.LinkedHashSet;
import java.util.Set;
public class App60 {
    public static void main(String[] args) {
        Set<String> linkedHashSet=new LinkedHashSet<String>();
        linkedHashSet.add("java");
        linkedHashSet.add("c++");
        linkedHashSet.add("java");
        linkedHashSet.add("PHP");
        for(String str:linkedHashSet){
            System.out.println(str);
        }
    }
}
