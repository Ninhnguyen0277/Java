import java.util.ArrayList;
import java.util.ListIterator;
public class App19 {
    public static void main(String[] args){
        ArrayList<Character> arrListcCharacters= new ArrayList<>();
        arrListcCharacters.add('b');
        arrListcCharacters.add('c');
        arrListcCharacters.add('d');
        arrListcCharacters.add('t');
        arrListcCharacters.add('e');
        ListIterator<Character> listIterator=arrListcCharacters.listIterator();
        System.out.println("cac phan tu co trong arrlistchar la");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
