import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
public class App88 {
    public static void main(String[] args) {
        HashMap<String,String> hashMapCity=new HashMap<>();
        hashMapCity.put("QNg", "Quang ngai");
        hashMapCity.put("Qn", "Quang nam");
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Thanh pho ho chi minh");
        System.out.println("danh sach cac thanh pho trong hashmapCIty:");
        Set<Map.Entry<String,String>> setCity= hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNg:"+hashMapCity.get("QNg"));
        System.out.println("NT:"+hashMapCity.get(NT));
        if (hashMapCity.containsValue("Thanh pho ho chi minh")) {
            System.out.println("co thanh pho ho chi minh trong hashMapCity");
        }

    }
}
