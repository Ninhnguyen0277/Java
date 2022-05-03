import java.util.ArrayList;
public class App17 {
    public static void main(String[] args){
        ArrayList<Integer> arrListIntegers=new ArrayList<>();
        arrListIntegers.add(0);
        arrListIntegers.add(3);
        arrListIntegers.add(4);
        arrListIntegers.add(6);
        arrListIntegers.add(2);
        System.out.println("cac phan tu trong arrlistinteger la");
        for(int number:arrListIntegers){
            System.out.println(number);
        }
    }
}
