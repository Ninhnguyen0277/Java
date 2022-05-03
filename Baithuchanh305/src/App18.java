import java.util.ArrayList;
import java.util.Iterator;
public class App18 {
    public static void main(String[] args){
        ArrayList<Float> arrayListFloat=new ArrayList<>();
        arrayListFloat.add(0.5f);
        arrayListFloat.add(1.4f);
        arrayListFloat.add(2.3f);
        arrayListFloat.add(4.6f);
        arrayListFloat.add(7.2f);
        Iterator<Float> iterator=arrayListFloat.iterator();
        System.out.println("cac phan tu co trong arrlistfloat la");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
